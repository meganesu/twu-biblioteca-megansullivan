package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class LibraryTest {

    @Test
    public void testGetBooks() {
        Library l = new Library();
        Book b1 = new Book("Winnie the Pooh", "A. A. Milne", 1926);
        Book b2 = new Book("The Little Prince", "Antoine de Saint-Exupery", 1943);
        Book b3 = new Book("Bad Feminist", "Roxane Gay", 2014);
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        assertEquals(bookList, l.getBooks());
    }
}
