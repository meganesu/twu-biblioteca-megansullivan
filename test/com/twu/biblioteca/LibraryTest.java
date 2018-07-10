package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class LibraryTest {

    @Test
    public void testGetBooks() {
        Library l = new Library();
        ArrayList<String> bookList = new ArrayList<String>();
        bookList.add("Winnie the Pooh");
        bookList.add("The Little Prince");
        bookList.add("Bad Feminist");
        assertEquals(bookList, l.getBooks());
    }
}
