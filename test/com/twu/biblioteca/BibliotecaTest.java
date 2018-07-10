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
        Book b1 = new Book("Winnie the Pooh", "A. A. Milne", 1926);
        Book b2 = new Book("The Little Prince", "Antoine de Saint-Exupery", 1943);
        Book b3 = new Book("Bad Feminist", "Roxane Gay", 2014);
        String bookList = b1.toString() + "\n" + b2.toString() + "\n" + b3.toString() + "\n";
        assertEquals(bookList, app.getBookList(lib));
    }
}
