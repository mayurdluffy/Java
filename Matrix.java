import java.util.*;
import java.util.Arrays;

public class Matrix{

	int[][] m;
	int row;
	int col;

	Matrix(int row, int col){

		m = new int[row][col];
		this.row = row;
		this.col = col;
	}

	void inputMatrix(){

		Scanner in = new Scanner(System.in);

		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				m[i][j] = in.nextInt();
	}

	void printMatrix(){

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}

	int[][] transpose(){

		int[][] transpose = new int[row][col];

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				transpose[i][j] = m[j][i];
			}
		}

		return transpose;
	}
	
	public static void main(String[] args){

		Matrix m1 = new Matrix(2, 2);

		m1.inputMatrix();
		m1.printMatrix();

		int[][] transposedMatrix = m1.transpose();

		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++)
				System.out.print(transposedMatrix[i][j] + " ");
			System.out.println();
		}
	}
}