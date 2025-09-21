package me.Ketchypp;

public class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void printInfo() {
        System.out.println("Title: " + title + " Author: " + author + " Year: " + year);
    }
}
