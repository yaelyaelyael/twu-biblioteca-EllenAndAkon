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
    public void shouldGetBookDetailsWhenListingBooks() {
        assertEquals(book.details(), "Book Title    |    Author    |    2000");
    }

    @Test
    public void shouldReturnColumnHeadingsWhenListingBooks() {
        assertEquals(book.columnHeadings(), "Title    |    Author    |    Year Published");
    }

}
