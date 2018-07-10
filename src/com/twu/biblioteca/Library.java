package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<String> books;

    public Library() {
        books = new ArrayList<String>();
        books.add("Winnie the Pooh");
        books.add("The Little Prince");
        books.add("Bad Feminist");
    }

    public ArrayList<String> getBooks() {
        return books;
    }


}
