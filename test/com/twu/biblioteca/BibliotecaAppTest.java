package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ykaufman on 6/17/15.
 */
public class BibliotecaAppTest {
    private PrintStream printStream;
    private Biblioteca biblioteca;
    private List<Book> books;
    private Menu menu;
    private BibliotecaApp bibliotecaApp;

    @Before
    public void setUp() {
        this.printStream = mock(PrintStream.class);
        this.biblioteca = mock(Biblioteca.class);
        this.menu = mock(Menu.class);
        bibliotecaApp = new BibliotecaApp(biblioteca, menu);
    }

    @Test
    public void shouldPerformAMenuSelectionWhenUserInputIsEntered() { //NEED TO FIX THIS TEST
        String userInput = "1. List Books";

        bibliotecaApp.getUserInput();

        verify(menu).performMenuSelection(userInput);
    }


}
