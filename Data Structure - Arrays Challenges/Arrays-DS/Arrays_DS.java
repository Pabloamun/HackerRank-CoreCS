package ds_Arrays;

import java.util.*;

public class Arrays_DS {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(A[i] + " ");
		}
		in.close();
	}
}
