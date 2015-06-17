package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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
    public void shouldGetBookDetailsWhenListingBooks() {
        assertEquals(book.details(), "Book Title    |    Author    |    2000");
    }

    @Test
    public void shouldReturnColumnHeadingsWhenListingBooks() {
        String details = String.format("%-15s %-15s %-30s %n", "Title", "Author", "Year Published");
        assertEquals(book.columnHeadings(), details);
    }

}
