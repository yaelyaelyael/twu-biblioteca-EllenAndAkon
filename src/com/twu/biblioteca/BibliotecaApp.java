package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(System.out, new ArrayList<Book>());

        biblioteca.start();
    }
}
