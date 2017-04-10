package basicProgrammingChallenges;

import java.util.Scanner;

public class VeryBigSum {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numbers = new int[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			numbers[i] = in.nextInt();
			sum += numbers[i];
		}
		System.out.println(sum);
		in.close();
	}
}
