package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by ykaufman on 6/17/15.
 */
public class Menu {
    
    private PrintStream printStream;
    private Biblioteca biblioteca;
    
    public Menu(PrintStream printStream, Biblioteca biblioteca) {
        this.printStream = printStream;
        this.biblioteca = biblioteca;
    }

    public void start() {
        biblioteca.printWelcomeMessage();
        displayMenu();
        performMenuSelection();
    }

    public void displayMenu() {
        printStream.println("Please select a menu option: ");
        printStream.println("List Books");
    }

    public void performMenuSelection() {
        biblioteca.listBooks();

    }
}
