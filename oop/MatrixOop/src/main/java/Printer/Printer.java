package Printer;


import Matrix.Matrix;

import java.util.Arrays;

public class Printer {

    public void print(Matrix matrix) {
        System.out.println("сортированная матрица: " + Arrays.toString(matrix.getMatrix()));
        System.out.println("Максимальный элемент: " + matrix.getMaxElement());
        System.out.println("Минимальный элемент: " + matrix.getMinElement());
        System.out.println("Сумма всех элементов: " + matrix.getSum());
        System.out.println("Среднее арифметическое всех элементов: " + matrix.getAverage());
    }
}
