package sortingChallenges;

import java.util.*;

public class MarkAndToys {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int k = in.nextInt();
		int[] toys = new int[N];
		for (int i = 0; i < N; i++) {
			toys[i] = in.nextInt();
		}
		Arrays.sort(toys);
		int sum = 0;
		int count = 0;
		for (int i = 0; i < N; i++) {
			sum += toys[i];
			if (sum > k) {
				count = i;
				break;
			}
		}
		System.out.println(count);
		in.close();
	}
}
