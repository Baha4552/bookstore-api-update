package com.example.bookstore.controller;

import com.example.bookstore.model.Book;
import com.example.bookstore.service.BookService;
import com.example.bookstore.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public Book create(@RequestParam String type,
                       @RequestParam String title,
                       @RequestParam String author) {
        return bookService.createAndSaveBook(type, title, author);
    }

    @GetMapping("/order-test")
    public OrderResponse testBuilder() {
        return new OrderResponse.Builder()
                .message("Order created successfully!")
                .book("OOP Design Patterns")
                .price(5500.0)
                .build();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        bookService.deleteBook(id);
        return "Book deleted successfully!";
    }
}