package Matrix;

public class Matrix {
    private final int[] matrix;
    private int maxElement;
    private int minElement;
    private int sum;
    public double average;

    public Matrix(int n){
        maxElement = 0;
        minElement = 10000000;
        matrix = new int[n];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = (int) Math.round((Math.random() * 1000) - 1);
        }
    }

    public void maxElement(){
        for (int j: matrix) {
            if (j > maxElement) {
                maxElement = j;
            }
        }
    }

    public void minElement(){
        for (int j: matrix) {
            if (j < minElement) {
                minElement = j;
            }
        }
    }

    public void sum(){
        for (int j: matrix) {
            sum += j;
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

    public void average(){
        average = (double) sum / matrix.length;
    }

    public int[] getMatrix() {
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
