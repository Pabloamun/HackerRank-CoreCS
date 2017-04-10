package basicProgrammingChallenges;

import java.util.*;

public class TheTimeInWords {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		Map<Integer, String> numbers = new HashMap<>();
		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.put(4, "four");
		numbers.put(5, "five");
		numbers.put(6, "six");
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		numbers.put(9, "nine");
		numbers.put(10, "ten");
		numbers.put(11, "eleven");
		numbers.put(12, "twelve");
		numbers.put(13, "thirteen");
		numbers.put(14, "fourteen");
		numbers.put(15, "quarter");
		numbers.put(16, "sixteen");
		numbers.put(17, "seventeen");
		numbers.put(18, "eigthteen");
		numbers.put(19, "nineteen");
		numbers.put(20, "twenty");

		if (M == 0) {
			System.out.println(numbers.get(H) + " o' clock");
		} else if (M < 21) {
			if (M == 1) {
				System.out.println("1 minute past " + numbers.get(H));
			} else if (M == 15) {
				System.out.println(numbers.get(M) + " past " + numbers.get(H));
			} else {
				System.out.println(numbers.get(M) + " minutes past "
						+ numbers.get(H));
			}
		} else if (M < 30) {
			System.out.println("twenty " + numbers.get(M % 20)
					+ " minutes past " + numbers.get(H));

		} else if (M == 30) {
			System.out.println("half past " + numbers.get(H));
		} else {
			if (60 - M > 20) {
				System.out.println("twenty " + numbers.get((60 - M) % 20)
						+ " minutes to " + numbers.get(H + 1));
			} else {
				if (60 - M == 1) {
					System.out.println("one minute to " + numbers.get(H + 1));
				} else if (60 - M == 15) {
					System.out.println(numbers.get(60 - M) + " to "
							+ numbers.get(H + 1));
				} else {
					System.out.println(numbers.get(60 - M) + " minutes to "
							+ numbers.get(H + 1));
				}

			}
		}
		in.close();
	}
}
