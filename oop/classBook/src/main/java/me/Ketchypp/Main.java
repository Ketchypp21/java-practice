package me.Ketchypp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        book.printInfo();
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        book2.printInfo();
        Book book3 = new Book("The Silmarillion", "J.R.R. Tolkien", 1977);
        book3.printInfo();
    }
}