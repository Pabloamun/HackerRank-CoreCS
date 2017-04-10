package basicProgrammingChallenges;

import java.util.Scanner;

public class JumpingTheClouds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int c[] = new int[n];
		int E = 100;
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		for (int i = 0; i <= n - k; i += k) {
			if (c[i] == 1) {
				E -= 3;
			} else
				E--;
		}
		System.out.println(E);
		in.close();
	}
}
