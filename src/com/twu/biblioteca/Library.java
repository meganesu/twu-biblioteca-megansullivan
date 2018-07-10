package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
        Book b1 = new Book("Winnie the Pooh", "A. A. Milne", 1926);
        Book b2 = new Book("The Little Prince", "Antoine de Saint-Exupery", 1943);
        Book b3 = new Book("Bad Feminist", "Roxane Gay", 2014);
        books.add(b1);
        books.add(b2);
        books.add(b3);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }


}
