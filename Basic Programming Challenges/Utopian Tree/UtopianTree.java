package basicProgrammingChallenges;

import java.util.Scanner;

public class UtopianTree {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while (testCases-- > 0) {
			int N = in.nextInt();
			int n = 1;
			while (N > 0) {
				n *= 2;
				N--;
				if (N == 0)
					break;
				n += 1;
				N--;
			}
			System.out.println(n);
			in.close();
		}

	}
}
