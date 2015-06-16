package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry Potter"));
        books.add(new Book("Lord of the Rings"));
        System.out.println("Welcome to Biblioteca!");
        for (Book book : books)
            System.out.println(book.getName());

    }
}
