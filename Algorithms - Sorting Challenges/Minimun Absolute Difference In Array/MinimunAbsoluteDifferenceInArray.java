package sortingChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class MinimunAbsoluteDifferenceInArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		// your code goes here
		Arrays.sort(a);
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
			min = Math.min(min, Math.abs(a[i] - a[i - 1]));
		}
		System.out.println(min);
		in.close();
	}
}
