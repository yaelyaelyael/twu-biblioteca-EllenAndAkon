package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BibliotecaApp {

    private Biblioteca biblioteca;
    private Menu menu;
    private AppBufferReader bufferedReader;

    public BibliotecaApp(Biblioteca biblioteca, Menu menu, AppBufferReader bufferedReader){
        this.biblioteca = biblioteca;
        this.menu = menu;
        this.bufferedReader = bufferedReader;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Real Book Title", "Real Book Author", "Real Year Published"));
        Biblioteca biblioteca = new Biblioteca(System.out, books);

        Menu menu = new Menu(System.out, biblioteca);
        AppBufferReader bufferedReader = new AppBufferReader(new InputStreamReader(System.in));

        BibliotecaApp bibliotecaApp = new BibliotecaApp(biblioteca, menu, bufferedReader);
        bibliotecaApp.start();
        }

    public void start() {
        biblioteca.printWelcomeMessage();
        menu.displayMenu();
        String userInput = getUserInput();
        menu.performMenuSelection(userInput);
    }

    public String getUserInput() {
        String userInput = "";
        userInput = bufferedReader.readLine();
        return userInput;
    }

    public void checkForInvalidInput(String userInput) {
    }
}
