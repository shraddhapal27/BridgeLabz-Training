import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int coloumn = sc.nextInt();
		
		// create a 2D array 
		int[][] matrix = new int[rows][coloumn];
		
		
		for(int i=0; i<rows; i++){
		  for(int j=0; j<coloumn; j++){
			matrix[i][j] = sc.nextInt();
		  }
		}
		int[] array = new int[rows * coloumn];
		int index = 0;
		
		// copying the elements from 2D array to 1D
		for(int i=0; i<rows; i++){
		  for(int j=0; j<coloumn; j++){
			array[index++] = matrix[i][j];
		  }
		}
		
		for(int i=0; i<array.length; i++){
		  System.out.print(array[i] + " , ");
		}
	}
}