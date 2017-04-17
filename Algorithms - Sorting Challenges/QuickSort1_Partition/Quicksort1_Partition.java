package sortingChallenges;

import java.util.*;

public class Quicksort1_Partition {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> left = new ArrayList<>();
		List<Integer> equal = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		int p = in.nextInt();
		equal.add(p);
		for (int i = 1; i < n; i++) {
			int next = in.nextInt();
			if (next == p)
				equal.add(next);
			else if (next < p)
				left.add(next);
			else
				right.add(next);
		}
		for (int a : left) {
			System.out.print(a + " ");
		}
		for (int b : equal) {
			System.out.print(b + " ");
		}
		for (int c : right) {
			System.out.print(c + " ");
		}
		in.close();
	}
}
