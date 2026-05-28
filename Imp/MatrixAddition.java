package Imp;

public class MatrixAddition {

	public static void main(String[] args) {

		int[][] firstMatrix = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] secondMatrix = { { 7, 8, 9 }, { 1, 2, 3 } };

		int[][] sum = new int[2][3];

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 3; j++) {

				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}

		System.out.println("Sum of Matrices:");

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(sum[i][j] + " ");
			}

			System.out.println();
		}
	}
}
