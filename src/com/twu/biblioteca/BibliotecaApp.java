package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        String userInput = getUserInput();
        menu.performMenuSelection(userInput);
    }

    public String getUserInput() { //NOT FULLY IMPLEMENTED
        String userInput = "";
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            userInput = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInput;
    }
}
