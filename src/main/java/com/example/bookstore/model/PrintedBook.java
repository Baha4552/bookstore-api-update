package com.example.bookstore.model;

import jakarta.persistence.Entity;

@Entity
public class PrintedBook extends Book {
    @Override
    public String getBookType() {
        return "Printed Paper Book";
    }
}