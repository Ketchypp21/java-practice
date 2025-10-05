package me.Ketchypp;

import farm.Animal;
import farm.Cat;
import farm.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Animal[] animals = new Animal[2];
       String[] name = {"Муся", "Лютик"};
       int[] age = {4, 2};
       animals[0] = new Cat();
       animals[1] = new Dog();

       for (int i = 0; i < animals.length; i++) {
           animals[i].setName(name[i]);
           animals[i].setAge(age[i]);
           System.out.println("Name: " + animals[i].getName());
           System.out.println("Age: " + animals[i].getAge());
           System.out.print("Eating: ");
           animals[i].eat();
           System.out.print("Sound: ");
           animals[i].makeSound();
           System.out.println();
       }
    }
}