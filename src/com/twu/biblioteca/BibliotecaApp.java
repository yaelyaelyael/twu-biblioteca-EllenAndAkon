package com.twu.biblioteca;

import java.io.InputStreamReader;
import java.util.ArrayList;

public class BibliotecaApp {

    private Biblioteca biblioteca;
    private Menu menu;
    private AppBufferReader appBufferReader;

    public BibliotecaApp(Biblioteca biblioteca, Menu menu, AppBufferReader appBufferReader){
        this.biblioteca = biblioteca;
        this.menu = menu;
        this.appBufferReader = appBufferReader;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Real Book Title", "Real Book Author", "Real Year Published"));
        Biblioteca biblioteca = new Biblioteca(System.out, books);

        Menu menu = new Menu(System.out, biblioteca);
        AppBufferReader appBufferReader = new AppBufferReader(new InputStreamReader(System.in));

        BibliotecaApp bibliotecaApp = new BibliotecaApp(biblioteca, menu, appBufferReader);
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
        userInput = appBufferReader.readLine();
        return userInput;
    }

    public void checkForInvalidInput(String userInput) {
    }
}
