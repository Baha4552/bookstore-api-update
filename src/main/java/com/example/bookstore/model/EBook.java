package com.example.bookstore.model;

import jakarta.persistence.Entity;

@Entity
public class EBook extends Book {
    @Override
    public String getBookType() {
        return "Electronic Book";
    }
}