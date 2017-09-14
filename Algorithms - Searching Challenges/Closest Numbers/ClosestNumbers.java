package sortingChallenges;

import java.util.*;

public class ClosestNumbers {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextLong();
		}
		Arrays.sort(arr);
		List<Long> list = new ArrayList<>();
		long min = 10000000;
		for (int i = 0; i < n - 1; i++) {
			min = Math.min(min, Math.abs(arr[i + 1] - arr[i]));
		}
		for (int i = 0; i < n - 1; i++) {
			if (Math.abs(arr[i + 1] - arr[i]) == min) {
				list.add(arr[i]);
				list.add(arr[i + 1]);

			}
		}
		for (Long s : list) {
			System.out.print(s + " ");
		}
		in.close();
	}
}