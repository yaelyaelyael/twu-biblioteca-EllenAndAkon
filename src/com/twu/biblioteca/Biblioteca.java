package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

public class Biblioteca {

    private PrintStream printStream;
    private List<Book> books;

    public Biblioteca(PrintStream printStream, List<Book> books) {
        this.printStream = printStream;
        this.books = books;
    }

    public void printWelcomeMessage() {
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
