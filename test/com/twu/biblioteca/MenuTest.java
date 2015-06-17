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
    private Menu menu;
    private Biblioteca biblioteca;

    @Before
    public void setUp() {
       printStream = mock(PrintStream.class);
       biblioteca = mock(Biblioteca.class);
       menu = new Menu(printStream, biblioteca);
    }


    @Test
    public void shouldDisplayFirstMenuOptionWhenThereIsOneMenuOption() {
        menu.displayMenu();

        verify(printStream).println(contains("List Books"));
    }

//    @Test
//    public void shouldPerformMenuSelectionWhenUserInputIsEntered() { //NEED TO MOVE
//        String userInput = "1. List Books";
//
//        menu.processUserInput(userInput);
//
//        verify(menu).performMenuSelection();
//    }

    @Test
    public void shouldListBooksWhenListBooksOptionIsSelected() {
        menu.performMenuSelection();

        verify(biblioteca).listBooks();
    }


}
