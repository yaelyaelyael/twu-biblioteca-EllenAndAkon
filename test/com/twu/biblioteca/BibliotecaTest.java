package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by egalperi on 6/16/15.
 */
public class BibliotecaTest {
    private PrintStream printStream;
    private Biblioteca biblioteca;
    private List<Book> books;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        books = new ArrayList<Book>();
        biblioteca = new Biblioteca(printStream, books);
    }

    @Test
    public void shouldPrintWelcomeMessageWhenAppStarts(){
        biblioteca.start();

        verify(printStream).println("Welcome to Biblioteca! Please select a menu option:");
    }

    @Test
    public void shouldPrintNothingWhenThereAreNoBooks() {
        biblioteca.listBooks();

        verify(printStream).println("No books available");
    }

    @Test
    public void shouldPrintOneBookWhenThereIsOneBook() {
        Book book1 = mock(Book.class);
        when(book1.details()).thenReturn("details");
        books.add(book1);
        biblioteca.listBooks();

        verify(printStream).println("details");
    }

    @Test
    public void shouldPrintAllBooksWhenThereAreMoreThanOneBook() {
        Book book1 = mock(Book.class);
        when(book1.details()).thenReturn("book1 details");
        books.add(book1);
        Book book2 = mock(Book.class);
        when(book2.details()).thenReturn("book2 details");
        books.add(book2);

        biblioteca.listBooks();

        verify(printStream).println("book1 details");
        verify(printStream).println("book2 details");
    }

    @Test
    public void shouldListMainMenuOptionListBooksWhenAppStart(){
        biblioteca.start();

        verify(printStream).println("List Books");
    }
}



