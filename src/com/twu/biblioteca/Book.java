package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String t, String a, int y) {
        title = t;
        author = a;
        yearPublished = y;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean equals(Object o) {
        Book b = (Book) o;
        return title.equals(b.getTitle()) && author.equals(b.getAuthor()) && yearPublished == b.getYearPublished();
    }

    public int hashCode() {
        return title.hashCode();
    }

    public String toString() {
        return String.format("%-20.20s %-20.20s %-4d", title, author, yearPublished);
    }
}
