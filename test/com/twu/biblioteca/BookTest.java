package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testBookHasName() {
        String name = "Book1";
        Book book = new Book(name);

        assertEquals(book.getName(), name);
    }
}
