package me.Ketchypp;

public class Library {
    private Book [] books;

    public Library() {
        books = new Book[10]; // например, начальный размер 10
    }

    public void ShowBooks() {
        boolean empty = true;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.print((i+1) + ". ");
                books[i].printTitle();
                empty = false;
            }
        }
        if (empty) {
            System.out.println("Библиотека пуста");
        }
    }

    public void ShowBookInfo(int number) {
        if (number >= 0 && number < books.length && books[number] != null) {
            books[number].printInfo();
        } else {
            System.out.println("Книга не найдена");
        }
    }

    public void AddBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Книга успешно добавлена");
                return;
            }
        }
        System.out.println("Библиотека переполнена");
    }

    public void RemoveBook(int number) {
        if (number >= 0 && number < books.length && books[number] != null) {
            books[number] = null;
            System.out.println("Книга успешно удалена");
        } else {
            System.out.println("Книга не найдена");
        }
    }
}
