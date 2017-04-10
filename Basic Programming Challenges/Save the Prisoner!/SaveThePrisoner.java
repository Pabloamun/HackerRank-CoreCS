package basicProgrammingChallenges;

import java.util.Scanner;

public class SaveThePrisoner {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while (testCases-- > 0) {
			long prisoners = in.nextLong();
			long candys = in.nextLong();
			long S = in.nextLong();
			long poisson = 0;
			if (candys <= prisoners - S - 1) {
				poisson = S + (candys - 1);
				System.out.println(poisson);
			} else {
				poisson = (S + (candys - 1)) % prisoners;
				if (poisson == 0)
					poisson = prisoners;
				System.out.println(poisson);
			}

		}
		in.close();
	}
}
