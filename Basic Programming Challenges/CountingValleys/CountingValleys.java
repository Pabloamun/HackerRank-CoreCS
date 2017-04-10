package basicProgrammingChallenges;

import java.util.Scanner;

public class CountingValleys {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		int level = 0;
		int valley = 0;
		char[] k = str.toCharArray();
		for (char c : k) {
			if (level == -1)
				if (c == 'U')
					valley++;

			if (c == 'U')
				level++;
			else
				level--;
		}
		System.out.println(valley);
		in.close();

	}
}
