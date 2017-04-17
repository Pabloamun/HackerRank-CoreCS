package sortingChallenges;

import java.util.Scanner;

public class CountingSort3 {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] count = new int[100];
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			count[in.nextInt()]++;
			str[i] = in.next();
		}
		int sum = 0;
		for (int i = 0; i < count.length; i++) {
			sum += count[i];
			System.out.print(sum + " ");
		}
		in.close();
	}
}
