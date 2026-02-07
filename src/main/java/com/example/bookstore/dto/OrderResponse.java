package com.example.bookstore.dto;

public class OrderResponse {
    private String message;
    private String bookTitle;
    private double price;

    private OrderResponse() {}

    public static class Builder {
        private OrderResponse res = new OrderResponse();

        public Builder message(String m) {
            res.message = m;
            return this;
        }

        public Builder book(String b) {
            res.bookTitle = b;
            return this;
        }

        public Builder price(double p) {
            res.price = p;
            return this;
        }

        public OrderResponse build() {
            return res;
        }
    }

    public String getMessage() { return message; }
    public String getBookTitle() { return bookTitle; }
    public double getPrice() { return price; }
}