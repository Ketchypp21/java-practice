package me.Ketchypp;

public class Book {
    private final String title;
    private final String author;
    private final int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void printInfo() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nYear: " + year);
    }

    void printTitle() {
        System.out.println(title);
    }
}
