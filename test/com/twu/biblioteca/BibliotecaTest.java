package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by egalperi on 6/16/15.
 */
public class BibliotecaTest {

    @Test
    public void testWelcomeMessagePrints(){
        PrintStream printStream = mock(PrintStream.class);

        Biblioteca biblioteca = new Biblioteca(printStream);
        biblioteca.start();

        verify(printStream).println("Welcome to Biblioteca!");

    }
}

