package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    private String title;
    private String author;
    private String yearPublished;
    private Book book;

    @Before
    public void setUp() {
        title = "Book Title";
        author = "Author";
        yearPublished = "2000";
        book = new Book(title, author, yearPublished);
    }

    @Test
    public void testBookHasName() {
        assertEquals(book.getTitle(), title);
    }

    @Test
    public void shouldHaveAnAuthor() {
        assertEquals(book.getAuthor(), author);
    }

    @Test
    public void shouldHaveAYearPublished() {
        assertEquals(book.getYearPublished(), yearPublished);
    }

}
