package basicProgrammingChallenges;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] numbers = new int[N];
		int count_positive = 0;
		int count_negative = 0;
		int count_zeroes = 0;
		for (int i = 0; i < N; i++) {
			numbers[i] = in.nextInt();
			if (numbers[i] == 0)
				count_zeroes++;
			else if (numbers[i] > 0)
				count_positive++;
			else
				count_negative++;
		}
		in.close();
		System.out.printf("%.6f", (double) count_positive / N);
		System.out.println();
		System.out.printf("%.6f", (double) count_negative / N);
		System.out.println();
		System.out.printf("%.6f", (double) count_zeroes / N);
	}
}
