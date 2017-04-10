package basicProgrammingChallenges;

import java.util.Scanner;

public class BeautifulDayAtTheMovies {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		in.close();
		int beatiful_day = 0;
		for (int day = i; day <= j; day++) {
			if (Math.abs(day - reverseInt(day)) % k == 0)
				beatiful_day++;
		}
		System.out.println(beatiful_day);
	}

	public static int reverseInt(int input) {
		long reversedNum = 0;
		long input_long = input;

		while (input_long != 0) {
			reversedNum = reversedNum * 10 + input_long % 10;
			input_long = input_long / 10;
		}

		if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
			throw new IllegalArgumentException();
		}
		return (int) reversedNum;
	}
}
