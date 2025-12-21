import java.util.Random;

public class MatrixManipulation {

    // Method to create a random matrix with given rows and columns
    public static int[][] createRandomMatrix(int rows, int cols, int maxVal) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(maxVal + 1); // random values from 0 to maxVal
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] diff = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diff[i][j] = A[i][j] - B[i][j];
            }
        }
        return diff;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int n = A[0].length; // columns of A = rows of B
        int[][] product = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                product[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return product;
    }

    // Main method
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int maxVal = 10;

        int[][] matrixA = createRandomMatrix(rows, cols, maxVal);
        int[][] matrixB = createRandomMatrix(rows, cols, maxVal);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        System.out.println("A + B:");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("A - B:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("A * B:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));
    }
}
