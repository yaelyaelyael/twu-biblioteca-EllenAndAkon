package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by egalperi on 6/16/15.
 */
public class Biblioteca {

    private PrintStream printStream;
    private List<Book> books;

    public Biblioteca(PrintStream printStream, List<Book> books) {
        this.printStream = printStream;
        this.books = books;
    }

    public void start() {
        printWelcomeMessage();
        printStream.println("List Books");
        listBooks();
    }

    private void printWelcomeMessage() {
        printStream.println("Welcome to Biblioteca! Please select a menu option:");
        printStream.println("");
    }

    public void listBooks() {
        printStream.println("title    |    author    |    year published");
        printStream.println("-------------------------------------------");
        for (Book book : books) {
            printStream.println(book.details());
        }

        printStream.println("");
    }
}
