package basicProgrammingChallenges;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		String time = in.next();
		String hour = time.substring(0, 2);
		String noon = time.substring(time.length() - 2);
		String military_time = "";
		if (hour.equals("12") && noon.equals("AM")) {
			military_time = "00" + time.substring(2, time.length() - 2);
		} else if (noon.equals("PM")) {
			if (hour.equals("12")) {
				military_time = "12" + time.substring(2, time.length() - 2);
			} else {
				int h = Integer.parseInt(hour) + 12;
				military_time = "" + h + time.substring(2, time.length() - 2);
			}
		} else {
			military_time = time.substring(0, time.length() - 2);
		}
		System.out.println(military_time);
		in.close();
	}
}
