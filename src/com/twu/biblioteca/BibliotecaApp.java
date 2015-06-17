package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("bookT", "bookA", "bookYP"));
        Menu menu = new Menu(System.out);
        Biblioteca biblioteca = new Biblioteca(System.out, books, menu);

        biblioteca.start();
    }
}
