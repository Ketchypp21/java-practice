package me.Ketchypp;

public class Book {
    private String title;
    private String author;
    private int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void printInfo() {
        System.out.println("Title: " + title + " Author: " + author + " Year: " + year);
    }
}
