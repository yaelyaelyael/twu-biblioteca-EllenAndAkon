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

    public void displayMenu() {
        printStream.println("Please select a menu option: ");
        printStream.println("1. List Books");
    }

    public void performMenuSelection(String userInput) {
        if (userInput.contains("1") || userInput.contains("List Books")) {
            biblioteca.listBooks();
        }
    }

}
