package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class BibliotecaTest {

    @Test
    public void testWelcomeMessage() {
        BibliotecaApp app = new BibliotecaApp();
        String msg = "Hello, welcome to Biblioteca!\n";
        assertEquals(msg, app.getWelcome());
    }

    @Test
    public void testPrintBooks() {
        BibliotecaApp app = new BibliotecaApp();
        Library lib = new Library();
        String bookList = "Winnie the Pooh\nThe Little Prince\nBad Feminist\n";
        assertEquals(bookList, app.getBookList(lib));

    }
}
