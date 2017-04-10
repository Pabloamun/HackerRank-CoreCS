package basicProgrammingChallenges;

import java.util.Scanner;

public class GradingStudents {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int a0 = 0; a0 < n; a0++) {
			int grade = in.nextInt();
			if (grade < 38) {
				System.out.println(grade);
			} else {
				int round = 0;
				for (int i = 0; i < 3; i++) {
					if ((grade + i) % 5 == 0) {
						round = grade + i;
						break;
					}
				}
				if (round != 0) {
					System.out.println(round);
				} else {
					System.out.println(grade);
				}
			}
		}
		in.close();
	}
}
