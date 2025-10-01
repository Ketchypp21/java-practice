package Matrix;

public class Matrix {
    private final int[] matrix;
    private int maxElement;
    private int minElement;
    private int sum;
    private double average;

    public Matrix(int n){
        matrix = new int[n];
        maxElement = matrix[0];
        minElement = matrix[0];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = (int) Math.round((Math.random() * 1000) - 1);
        }
    }

    public void sorter(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i] > matrix[j]) {
                    int temp = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = temp;
                }
            }
        }
    }

    public void calculate() {
        maxElement = matrix[0];
        minElement = matrix[0];
        sum = 0;

        for (int value : matrix) {
            if (value > maxElement) maxElement = value;
            if (value < minElement) minElement = value;
            sum += value;
        }
        average = (double) sum / matrix.length;
    }

    public int[] getSortedMatrix() {
        sorter();
        return matrix;
    }

    public int getMaxElement() {
        return maxElement;
    }

    public int getMinElement() {
        return minElement;
    }

    public int getSum() {
        return sum;
    }

    public double getAverage() {
        return average;
    }
}
