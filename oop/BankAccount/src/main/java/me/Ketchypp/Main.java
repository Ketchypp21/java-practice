package me.Ketchypp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000);
        account.deposit(500);
        account.withdraw(200);
        account.printInfo(); // должно показать: владелец Alice, баланс 1300


        BankAccount account2 = new BankAccount("Bob", 0);
        account2.deposit(700);
        account2.withdraw(800);
        account2.printInfo();
    }
}