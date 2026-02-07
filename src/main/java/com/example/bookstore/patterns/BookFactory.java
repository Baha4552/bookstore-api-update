package com.example.bookstore.patterns;
import com.example.bookstore.model.*;

public class BookFactory {
    public static Book createBook(String type) {
        if (type == null) return null;
        if (type.equalsIgnoreCase("EBOOK")) return new EBook();
        if (type.equalsIgnoreCase("PRINTED")) return new PrintedBook();
        return null;
    }
}