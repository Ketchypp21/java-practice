package me.Ketchypp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] massive = new int[5][5];
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j] = (int) (Math.random() * 9 + 1);
                System.out.print(massive[i][j] + " ");
            }
            sum += massive[i][i];
            sum2 += massive[i][massive.length - i - 1];
            System.out.println();
        }

        System.out.println("Сумма элементов главной диагонали: " + sum);
        System.out.println("Сумма элементов побочной диагонали: " + sum2);
    }
}