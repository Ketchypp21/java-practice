package me.Ketchypp;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int massive[] = new int[10];


        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 100 + 1);

        }

        System.out.println("Массив: " + Arrays.toString(massive));

        int max = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (max < massive[i]) {
                max = massive[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
    }
}



//
//Задача (1D массив):
//Создай массив из 10 случайных чисел (от 1 до 100).
//Требуется:
//
//Вывести массив в консоль.
//
//Найти и вывести максимальный и минимальный элементы массива.
//
//Посчитать среднее арифметическое всех элементов массива.