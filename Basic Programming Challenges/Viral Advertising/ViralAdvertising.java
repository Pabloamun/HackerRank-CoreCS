package basicProgrammingChallenges;

import java.util.Scanner;

public class ViralAdvertising {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int people = 5;
		int people_like = 0;
		int m = 0;

		for (int i = 1; i <= n; i++) {
			people = people / 2;
			people_like += people;
			m = people * 3;
			people = m;

		}
		System.out.println(people_like);
		in.close();
	}
}
