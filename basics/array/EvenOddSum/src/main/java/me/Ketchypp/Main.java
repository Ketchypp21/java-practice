package me.Ketchypp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int massive[] = new int[15];
       for (int i = 0; i < massive.length; i++) {
           massive[i] = (int) (Match.random() * 50) + 1;
       }
    }
}


//Создай массив из 15 случайных чисел от 1 до 50.
//
//Выведи массив в консоль.
//
//Посчитай и выведи:
//
//сколько чисел чётные,
//
//сколько чисел нечётные,
//
//сумму всех чётных чисел.