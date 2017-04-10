package basicProgrammingChallenges;

import java.util.Scanner;

public class StrangeCounter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		long t1 = 1, count = 3, special = 3;
		while (true) {
			if (t <= special) {
				System.out.println(count - (t - t1));
				break;
			} else {
				t1 = special + 1;
				count *= 2;
				special += count;
			}
		}
		in.close();
	}
}
