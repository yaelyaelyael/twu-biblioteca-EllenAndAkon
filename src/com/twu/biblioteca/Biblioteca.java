package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by egalperi on 6/16/15.
 */
public class Biblioteca {

    private PrintStream printStream;
    private ArrayList<Book> books;

    public Biblioteca(PrintStream printStream) {
        this.printStream = printStream;
        books = new ArrayList<Book>();
        books.add(new Book("Harry Potter"));
        books.add(new Book("Lord of the Rings"));
    }

    public void start() {
        printStream.println("Welcome to Biblioteca!");
    }

    public void listBooks() {
        for (Book book : books)
            printStream.println(book.getName());
    }
}
