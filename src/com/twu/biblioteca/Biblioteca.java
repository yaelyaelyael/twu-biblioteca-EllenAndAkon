package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by egalperi on 6/16/15.
 */
public class Biblioteca {

    private PrintStream printStream;
    private List<Book> books;
    private Menu menu;

    public Biblioteca(PrintStream printStream, List<Book> books, Menu menu) {
        this.printStream = printStream;
        this.books = books;
        this.menu = menu;
    }

    public void start() {
        printWelcomeMessage();
        menu.displayMenu();
        listBooks();
    }

    private void printWelcomeMessage() {
        printStream.println("Welcome to Biblioteca!");
        printStream.println("");
    }

    public void listBooks() {
        if(books.isEmpty()) {
            printStream.println("No books available");
        } else {
            printStream.println(books.get(0).columnHeadings());
            for (Book book : books) {
                printStream.println(book.details());
            }
        }
    }
}
