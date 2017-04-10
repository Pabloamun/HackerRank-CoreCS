package basicProgrammingChallenges;

import java.util.Scanner;

public class BitwiseAND {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int TestCases = in.nextInt();
		while (TestCases-- > 0) {
			int n = in.nextInt();
			int[] array = new int[n];
			int k = in.nextInt();
			int max = -1;
			for (int i = 0; i < n; i++) {
				array[i] = i + 1;
			}
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					max = ((array[i] & array[j]) < k) ? Math.max(max, array[i]
							& array[j]) : max;

				}
			}
			System.out.println(max);
		}
		in.close();
	}
}
