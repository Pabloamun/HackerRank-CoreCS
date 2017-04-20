package sortingChallenges;

import java.util.Arrays;

import java.util.Scanner;

public class PermutingTwoArrays {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		while (q-- > 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] A = new int[n];
			int[] B = new int[n];
			for (int i = 0; i < n; i++) {
				A[i] = in.nextInt();
			}
			for (int i = 0; i < n; i++) {
				B[i] = in.nextInt();
			}
			Arrays.sort(A);
			Arrays.sort(B);
			boolean flag = false;
			for (int i = 0; i < n; i++) {
				if ((A[i] + B[n - 1 - i]) >= k) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			System.out.println((flag) ? "YES" : "NO");
		}
		in.close();
	}

}
