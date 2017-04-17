package sortingChallenges;

import java.util.Scanner;

public class CountingSort2 {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] count = new int[100];
		for (int i = 0; i < n; i++) {
			count[in.nextInt()]++;
		}
		for (int i = 0; i < count.length; i++) {
			while (count[i]-- > 0) {
				System.out.print(i + " ");
			}
		}
		in.close();
	}
}
