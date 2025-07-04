package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        bookRepository.add(title);
    }

    public void displayBooks() {
        for (String book : bookRepository.getBooks()) {
            System.out.println("Book: " + book);
        }
    }
}
