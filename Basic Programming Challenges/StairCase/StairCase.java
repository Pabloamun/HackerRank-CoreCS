package basicProgrammingChallenges;

import java.util.*;

public class StairCase {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[][] graph = new char[n + 1][n];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				graph[i][j] = ' ';
				System.out.print(graph[i][j]);
			}
			for (int j = n - i; j < n; j++) {
				graph[i][j] = '#';
				System.out.print(graph[i][j]);
			}
			System.out.println();
		}
		in.close();
	}
}
