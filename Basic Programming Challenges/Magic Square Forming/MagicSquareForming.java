package basicProgrammingChallenges;

import java.util.Scanner;

public class MagicSquareForming {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		int[][][] perm = { { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } },
				{ { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
				{ { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
				{ { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
				{ { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } },
				{ { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },
				{ { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
				{ { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } } };

		int mincost = 81;

		for (int[][] itm : perm) {
			int curr = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					curr += Math.abs(matrix[i][j] - itm[i][j]);
				}
			}
			mincost = Math.min(curr, mincost);
		}
		System.out.println(mincost);
		in.close();
	}
}
