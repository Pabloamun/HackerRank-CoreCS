package basicProgrammingChallenges;

import java.util.Scanner;

public class BetweenTwoSets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}
		in.close();
		int lcm = LCM(a);
		// System.out.println(lcm);
		int gcd = GCD(b);
		// System.out.println(gcd);
		int count = 0;

		for (int i = lcm; i <= gcd; i += lcm) {
			if (gcd % i == 0)
				count++;
		}

		System.out.println(count);

	}

	private static int LCM(int[] a) {
		int next = a[0];
		for (int i = 1; i < a.length; i++) {
			next = LCM(next, a[i]);
		}
		return next;
	}

	private static int LCM(int a, int b) {
		int lcm = (a * b) / GCD(b, (a % b));
		return lcm;
	}

	private static int GCD(int[] b) {
		int next = b[0];
		for (int i = 1; i < b.length; i++) {
			next = GCD(next, b[i]);
		}
		return next;
	}

	private static int GCD(int a, int b) {
		/*
		 * if (a == 0) return b; else if (b == 0) return a;
		 */
		while (b > 0) {
			int temp = b;
			b = (a % b);
			a = temp;
		}
		return a;
	}

}
