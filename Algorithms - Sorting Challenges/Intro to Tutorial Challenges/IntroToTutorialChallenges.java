package sortingChallenges;

import java.util.Scanner;

public class IntroToTutorialChallenges {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int Num_search = in.nextInt();
		int n = in.nextInt();
		int solution = 0;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			if (num == Num_search) {
				solution = i;
				break;
			}
		}
		System.out.println(solution);
		in.close();
	}
}
