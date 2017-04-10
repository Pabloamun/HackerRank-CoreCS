package basicProgrammingChallenges;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int firstDiagonal = 0;
		int secondDiagonal = 0;
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = i; j <= i; j++) {
				firstDiagonal += matrix[i][j];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = n - 1 - i; j >= n - i - 1; j--) {
				secondDiagonal += matrix[i][j];
			}
		}
		int difference = Math.abs(firstDiagonal - secondDiagonal);
		System.out.println(difference);
		in.close();
	}
}
