package com.example.bookstore.config;

public class DatabaseConfig {

    private static DatabaseConfig instance;

    private String dbUrl = "jdbc:h2:mem:bookstore";

    private DatabaseConfig() {}

    public static synchronized DatabaseConfig getInstance() {
        if (instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }

    public String getDbUrl() { return dbUrl; }
}