package com.library.repository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<String> books = new ArrayList<>();

    public void add(String book) {
        books.add(book);
    }

    public List<String> getBooks() {
        return books;
    }
}
