package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by egalperi on 6/16/15.
 */
public class BibliotecaTest {
    private PrintStream printStream;
    private Biblioteca biblioteca;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        biblioteca = new Biblioteca(printStream);
    }

    @Test
    public void testWelcomeMessagePrints(){

        biblioteca.start();

        verify(printStream).println("Welcome to Biblioteca!");

    }

    @Test
    public void testItPrintsListOfBooks() {
        biblioteca.listBooks();

        verify(printStream).println("Harry Potter");
        verify(printStream).println("Lord of the Rings");
    }
}



