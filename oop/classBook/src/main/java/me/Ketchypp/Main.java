package me.Ketchypp;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library Library = new Library();
        boolean flag = true;
        int number;
        Scanner scanner = new Scanner(System.in);


        while (flag) {
            System.out.println();
            System.out.println("Добро пожаловать в библиотеку!");
            System.out.println("Выберите действие: ");
            System.out.println("1. Просмотр списка книг");
            System.out.println("2. Просмотр информации о книге");
            System.out.println("3. Добавление книги");
            System.out.println("4. Удаление книги");
            System.out.println("0. Выход");


            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    Library.ShowBooks();
                    System.out.println("для продолжения нажмите Enter");
                    scanner.nextLine();
                    break;
                case 2:
                    Library.ShowBooks();
                    System.out.println("Введите номер книги для просмотра:");
                    number = scanner.nextInt();
                    Library.ShowBookInfo(number - 1);

                    scanner.nextLine();
                    System.out.println("для продолжения нажмите Enter");
                    scanner.nextLine();

                    break;
                case 3:
                    boolean addBook = true;
                    while (addBook) {
                        System.out.println("Введите название книги: ");
                        String title = scanner.nextLine();
                        System.out.println("Введите автора книги: ");
                        String author = scanner.nextLine();
                        System.out.println("Введите год издания книги: ");
                        int year = scanner.nextInt();
                        scanner.nextLine();

                        Book book = new Book(title, author, year);
                        Library.AddBook(book);

                        System.out.println("Добавить еще книгу? (Да - 1, Нет - 0)");
                        int add = scanner.nextInt();
                        scanner.nextLine();
                        if (add == 0) {
                            addBook = false;
                        }
                    }
                    break;
                case 4:
                    boolean deleteBook = true;
                    Library.ShowBooks();
                    while (deleteBook) {
                        System.out.println("4. Удаление книги");
                        System.out.println("Выведите номер киниги, которую хотите удалить: ");
                        number = scanner.nextInt();
                        Library.RemoveBook(number - 1);
                        System.out.println("Книга удалена удалить еще книгу? (Да - 1, Нет - 0)");

                        int delete = scanner.nextInt();
                        scanner.nextLine();
                        if (delete == 0) {
                            deleteBook = false;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Пакесы");
                    flag = false;
                    break;
                default:
                    System.out.println("Неверное значение");
            }
        }
    }
}