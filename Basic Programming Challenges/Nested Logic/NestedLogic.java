package basicProgrammingChallenges;

import java.util.Scanner;

public class NestedLogic {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int day = in.nextInt();
		int month = in.nextInt();
		int year = in.nextInt();

		int day_e = in.nextInt();
		int month_e = in.nextInt();
		int year_e = in.nextInt();

		if (year == year_e && month == month_e && day - day_e > 0) {
			System.out.println((day - day_e) * 15);
		} else if (year == year_e && (month - month_e) > 0) {
			System.out.println((month - month_e) * 500);
		} else if (year - year_e > 0) {
			System.out.println(10000);
		} else {
			System.out.println(0);
		}
		in.close();
	}
}
