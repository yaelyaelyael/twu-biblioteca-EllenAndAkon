package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    private Biblioteca biblioteca;
    private Menu menu;

    public BibliotecaApp(Biblioteca biblioteca, Menu menu){
        this.biblioteca = biblioteca;
        this.menu = menu;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Real Book Title", "Real Book Author", "Real Year Published"));
        Biblioteca biblioteca = new Biblioteca(System.out, books);

        Menu menu = new Menu(System.out, biblioteca);

        BibliotecaApp bibliotecaApp = new BibliotecaApp(biblioteca, menu);
        bibliotecaApp.start();
        }

    public void start() {
        biblioteca.printWelcomeMessage();
        menu.displayMenu();
        menu.performMenuSelection();
    }

}
