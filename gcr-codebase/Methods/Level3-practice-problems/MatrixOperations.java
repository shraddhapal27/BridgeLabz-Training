import java.util.Random;

public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols, int maxVal) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(maxVal + 1); // values 0 to maxVal
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%8.3f", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to display an integer matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to find transpose
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];
        return transpose;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) return null; // No inverse
        double[][] inv = new double[2][2];
        inv[0][0] = matrix[1][1] / det;
        inv[0][1] = -matrix[0][1] / det;
        inv[1][0] = -matrix[1][0] / det;
        inv[1][1] = matrix[0][0] / det;
        return inv;
    }

    // Inverse of 3x3 matrix using cofactor method
    public static double[][] inverse3x3(int[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null; // No inverse

        double[][] inv = new double[3][3];
        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1])/det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1])/det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1])/det;
        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0])/det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0])/det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0])/det;
        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0])/det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0])/det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0])/det;

        return inv;
    }

    // Main method
    public static void main(String[] args) {
        int[][] matrix2x2 = createRandomMatrix(2, 2, 10);
        int[][] matrix3x3 = createRandomMatrix(3, 3, 10);

        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("Transpose of 2x2 Matrix:");
        displayMatrix(transposeMatrix(matrix2x2));

        System.out.println("Determinant of 2x2 Matrix: " + determinant2x2(matrix2x2));

        double[][] inv2x2 = inverse2x2(matrix2x2);
        if (inv2x2 != null) {
            System.out.println("Inverse of 2x2 Matrix:");
            displayMatrix(inv2x2);
        } else {
            System.out.println("2x2 Matrix is singular, no inverse exists.");
        }

        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);

        System.out.println("Transpose of 3x3 Matrix:");
        displayMatrix(transposeMatrix(matrix3x3));

        System.out.println("Determinant of 3x3 Matrix: " + determinant3x3(matrix3x3));

        double[][] inv3x3 = inverse3x3(matrix3x3);
        if (inv3x3 != null) {
            System.out.println("Inverse of 3x3 Matrix:");
            displayMatrix(inv3x3);
        } else {
            System.out.println("3x3 Matrix is singular, no inverse exists.");
        }
    }
}
