package basicProgrammingChallenges;

import java.util.Scanner;

public class CavityMap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[][] grid = new char[n][n];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			grid[grid_i] = in.next().toCharArray();
		}
		char[][] sol = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sol[i][j] = grid[i][j];
			}
		}
		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				int max = ((int) grid[i][j] <= (int) grid[i - 1][j]) ? 0
						: (((int) grid[i][j] <= (int) grid[i + 1][j]) ? 0
								: (((int) grid[i][j] <= (int) grid[i][j - 1]) ? 0
										: (((int) grid[i][j] <= (int) grid[i][j + 1]) ? 0
												: (int) grid[i][j])));
				if (max == (int) grid[i][j])
					sol[i][j] = 'X';
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(sol[i][j]);
			}
			System.out.println();
		}
		in.close();
	}
}
