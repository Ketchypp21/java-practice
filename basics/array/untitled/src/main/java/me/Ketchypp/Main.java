package me.Ketchypp;

import java.util.Arrays;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        int mas1[] = new int[25];
        int mas2[] = new int[25];

        int index = 0;
        for (int i = 2; i < 100; i++) {
            boolean flag = true;
            int simple = i;
            for (int j = 2; j <= sqrt(simple); j++) {
                if (simple % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                mas1[index] = simple;
                index++;
            }
        }

        for (int i = 0; i < mas1.length; i++) {
            mas2[i] = mas1[mas1.length - 1 - i];
        }

        System.out.println("Массив 1: " + Arrays.toString(mas1) + "\nМассив 2: " + Arrays.toString(mas2));
    }
}

//Заполнить массив правильными цифрами
//вывести массив в консоль
//заполнить второй массив значениями из первого в обратном порядке


