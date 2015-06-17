package com.twu.biblioteca;

import java.io.PrintStream;

/**
 * Created by ykaufman on 6/17/15.
 */
public class Menu {
    
    private PrintStream printStream;
    
    public Menu(PrintStream printStream) {
        this.printStream = printStream;
        
    }


    public void displayMenu() {
        printStream.println("Please select a menu option: ");
        printStream.println("List Books");
    }
}
