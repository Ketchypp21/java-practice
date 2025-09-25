package me.Ketchypp;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int[] massive = new int[15];
       int even = 0;
       int odd = 0;
       int sum = 0;

       for (int i = 0; i < massive.length; i++) {
           massive[i] = (int) (Math.random() * 50) + 1;
       }
       System.out.println("Массив: " + Arrays.toString(massive));

        for (int j : massive) {
            if (j % 2 == 0) {
                even++;
                sum += j;
            } else {
                odd++;
            }
        }
       System.out.println("Четных: " + even);
       System.out.println("Сумма четных: " + sum);
       System.out.println("Нечетных: " + odd);
    }
}