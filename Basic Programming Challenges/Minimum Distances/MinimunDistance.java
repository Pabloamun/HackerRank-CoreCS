package basicProgrammingChallenges;

import java.util.Scanner;

public class MinimunDistance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int A[] = new int[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
		}
		int min = 1000;
		for (int i = 0; i < n; i++) {
			int num = A[i];
			for (int j = 0; j < n; j++) {
				if (num == A[j] && i != j) {
					min = Math.min(min, Math.abs(i - j));
				}
			}

		}
		int ans = (min == 1000) ? -1 : min;
		System.out.println(ans);
		in.close();
	}
}
