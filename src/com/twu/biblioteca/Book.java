package com.twu.biblioteca;


public class Book {
    private String title;
    private String author;
    private String yearPublished;

    public Book(String name, String author, String yearPublished) {
        this.title = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String details() {

        return String.format("%-15s %-15s %-30s %n", title, author, yearPublished);
    }

    public String columnHeadings() {
        return String.format("%-15s %-15s %-30s %n", "Title", "Author", "Year Published");
    }

}
