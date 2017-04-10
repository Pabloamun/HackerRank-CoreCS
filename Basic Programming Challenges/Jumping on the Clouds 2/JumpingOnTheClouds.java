package basicProgrammingChallenges;

import java.util.Scanner;

public class JumpingOnTheClouds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}
		int jump = 0;
		for (int i = 0; i < n - 1; i += 2) {
			if (c[i] != 0) {
				i--; // go one cloud back to avoid thundercloud
			}
			jump++;

		}
		System.out.println(jump);
		in.close();
	}
}
