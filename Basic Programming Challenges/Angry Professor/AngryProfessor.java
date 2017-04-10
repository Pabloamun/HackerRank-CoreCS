package basicProgrammingChallenges;

import java.util.Scanner;

public class AngryProfessor {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while (testCases-- > 0) {
			int students = in.nextInt();
			int K = in.nextInt();
			int count = 0;
			for (int i = 0; i < students; i++) {
				if (in.nextInt() <= 0)
					count++;
			}
			String ans = (count >= K) ? "NO" : "YES";
			System.out.println(ans);
		}
		in.close();
	}
}
