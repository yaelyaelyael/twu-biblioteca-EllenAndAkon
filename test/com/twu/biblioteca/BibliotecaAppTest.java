package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.Buffer;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by ykaufman on 6/17/15.
 */
public class BibliotecaAppTest {
    private PrintStream printStream;
    private Biblioteca biblioteca;
    private List<Book> books;
    private Menu menu;
    private BibliotecaApp bibliotecaApp;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() {
        this.printStream = mock(PrintStream.class);
        this.biblioteca = mock(Biblioteca.class);
        this.menu = mock(Menu.class);
        this.bufferedReader = mock(BufferedReader.class);
        bibliotecaApp = new BibliotecaApp(biblioteca, menu, bufferedReader);
    }

    @Test
    public void shouldCallPerformMenuSelectionWhenUserInputIsEntered() throws IOException {
        String userInput = "Test";
        when(bufferedReader.readLine()).thenReturn("Test");

        bibliotecaApp.start();

        verify(menu).performMenuSelection(userInput);
    }


}
