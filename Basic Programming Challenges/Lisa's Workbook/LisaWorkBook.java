package basicProgrammingChallenges;

import java.util.Scanner;

public class LisaWorkBook {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int chapters = in.nextInt();
		int ppp = in.nextInt();
		boolean isTurn = false;
		int[] workBook = new int[chapters];
		for (int i = 0; i < chapters; i++)
			workBook[i] = in.nextInt();

		int page = 1, specialProblem = 0;
		for (int i = 1; i <= chapters; i++) {
			for (int j = 1; j <= workBook[i - 1]; j++) {
				specialProblem = (page == j) ? specialProblem + 1
						: specialProblem;
				if (j % ppp == 0) {
					page++;
					isTurn = true;
				} else
					isTurn = false;
			}
			if (isTurn == false)
				page++;
		}
		System.out.println(specialProblem);
		in.close();
	}
}
