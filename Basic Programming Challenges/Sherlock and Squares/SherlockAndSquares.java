package basicProgrammingChallenges;

import java.util.Scanner;

public class SherlockAndSquares {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while (testCases-- > 0) {
			int start = in.nextInt();
			int end = in.nextInt();
			int in_range = 0;
			for (int i = 1; i <= Math.sqrt(end); i++) {
				if (Math.pow(i, 2) >= start && Math.pow(i, 2) <= end)
					in_range++;
			}
			System.out.println(in_range);
		}
		in.close();
	}
}
