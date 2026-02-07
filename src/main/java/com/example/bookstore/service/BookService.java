package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import com.example.bookstore.patterns.BookFactory;
import com.example.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book createAndSaveBook(String type, String title, String author) {
        Book book = BookFactory.createBook(type);
        if (book != null) {
            book.setTitle(title);
            book.setAuthor(author);
            return bookRepository.save(book);
        }
        throw new IllegalArgumentException("Invalid book type");
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}