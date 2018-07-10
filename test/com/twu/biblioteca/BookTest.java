package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testEquals() {
        Book b1 = new Book("Winnie the Pooh", "A. A. Milne", 1926);
        Book b2 = new Book("Winnie the Pooh", "A. A. Milne", 1926);
        assertTrue(b1.equals(b2));
    }

    @Test
    public void testToString() {
        Book book = new Book("Winnie the Pooh", "A. A. Milne", 1926);
        String s = String.format("%-20.20s %-20.20s %-4d", book.getTitle(), book.getAuthor(), book.getYearPublished());
        assertEquals(s, book.toString());
        assertTrue(book.toString().length() == 46);

        // Truncate author
        book = new Book("The Little Prince", "Antoine de Saint-Exupery", 1943);
        s = String.format("%-20.20s %-20.20s %-4d", book.getTitle(), book.getAuthor(), book.getYearPublished());
        assertEquals(s, book.toString());
        assertTrue(book.toString().length() == 46);

        // Truncate title
        book = new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 1998);
        s = String.format("%-20.20s %-20.20s %-4d", book.getTitle(), book.getAuthor(), book.getYearPublished());
        assertEquals(s, book.toString());
        assertTrue(book.toString().length() == 46);
    }
}
