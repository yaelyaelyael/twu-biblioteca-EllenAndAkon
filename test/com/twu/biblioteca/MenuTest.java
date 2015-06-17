package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ykaufman on 6/17/15.
 */
public class MenuTest {

    private PrintStream printStream;

    @Before
    public void setUp() {
       printStream = mock(PrintStream.class);
    }


    @Test
    public void shouldDisplayFirstMenuOptionWhenThereIsOneMenuOption() {
        Menu menu = new Menu(printStream);

        menu.displayMenu();

        verify(printStream).println(contains("List Books"));
    }
}
