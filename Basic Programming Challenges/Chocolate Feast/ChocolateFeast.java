package basicProgrammingChallenges;

import java.util.Scanner;

public class ChocolateFeast {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while (testCases-- > 0) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();

			int eaten = n / c;
			int wrappers = eaten;

			while (wrappers >= m) {
				int traded = wrappers / m;
				eaten += traded;
				wrappers = wrappers % m + traded;
			}
			System.out.println(eaten);
			in.close();
		}
	}
}
