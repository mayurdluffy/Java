import java.util.*;

public class MatrixMultiplication{

	static Scanner in = new Scanner(System.in);

	static void inputMatrix(int[][] a, int row, int col){

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				a[i][j] = in.nextInt();
			}
		}
	}

	static void printMatrix(int[][] a, int row, int col){

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] multiplyMatrix(int[][] a, int[][] b, int row1, int col1, int col2){

		int[][] result = new int[row1][col2];

		for(int i=0; i<row1; i++){
			for(int j=0; j<col2; j++){
				result[i][j] = 0;
				for(int k=0; k<col1; k++){
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return result;
	}

	public static void main(String[] args){


		int row1 = in.nextInt();
		int col1 = in.nextInt();
		int row2 = in.nextInt();
		int col2 = in.nextInt();


		int[][] a = new int[row1][col1];
		int[][] b = new int[row2][col2];

		inputMatrix(a, row1, col1);
		inputMatrix(b, row2, col2);

		int[][] result = multiplyMatrix(a, b, row1, col2, col1);

		printMatrix(result, row1, col2);
		
	}
}