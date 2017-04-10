package basicProgrammingChallenges;

import java.util.Scanner;

public class FindDigits {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-- > 0) {
			int N = in.nextInt();
			String str = "" + N;
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				int digit = Integer.parseInt("" + str.charAt(i));
				if (digit == 0)
					continue;
				else if (N % digit == 0)
					count++;
			}
			System.out.println(count);
			in.close();
		}

	}
}
