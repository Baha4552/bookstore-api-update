package com.example.bookstore.cache;

import java.util.HashMap;
import java.util.Map;

public class BookCache {
    private static BookCache instance;

    private final Map<String, Object> storage = new HashMap<>();

    private BookCache() {}

    public static synchronized BookCache getInstance() {
        if (instance == null) {
            instance = new BookCache();
        }
        return instance;
    }

    public void put(String key, Object value) {
        storage.put(key, value);
    }

    public Object get(String key) {
        return storage.get(key);
    }

    public void clear() {
        storage.clear();
    }
}
