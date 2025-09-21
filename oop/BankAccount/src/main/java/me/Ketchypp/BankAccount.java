package me.Ketchypp;

public class BankAccount {
    private final String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void printInfo(){
        System.out.println("Владелец: " + owner);
        System.out.println("Баланс: " + balance);
    }
}
