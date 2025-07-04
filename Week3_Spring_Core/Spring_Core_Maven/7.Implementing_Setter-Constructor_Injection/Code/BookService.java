package com.library;

public class BookService {
    private BookRepository bookRepository;
    private String librarianName;
    public BookService() {
    }
    // Constructor for injection
    public BookService(String librarianName) {
        this.librarianName = librarianName;
        System.out.println("Constructor Injection: Librarian - " + librarianName);
    }

    // Setter for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection: BookRepository set");
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
