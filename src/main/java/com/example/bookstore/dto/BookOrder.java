package com.example.bookstore.dto;
import java.util.List;

public class BookOrder {
    private String customerName;
    private List<String> bookTitles;
    private boolean isExpressDelivery;

    private BookOrder() {}

    public static class Builder {
        private BookOrder order = new BookOrder();

        public Builder customer(String name) {
            order.customerName = name;
            return this;
        }

        public Builder books(List<String> titles) {
            order.bookTitles = titles;
            return this;
        }

        public Builder express(boolean isExpress) {
            order.isExpressDelivery = isExpress;
            return this;
        }

        public BookOrder build() {
            return order;
        }
    }
}