package basicProgrammingChallenges;

import java.util.Scanner;

public class Consecutives1inBinaryNumbers {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		String binary_number = Long.toBinaryString(n);
		int count = 0;
		int ones = 0;
		for (int i = 0; i < binary_number.length(); i++) {
			if (binary_number.charAt(i) == '0') {
				count = Math.max(count, ones);
				ones = 0;
			} else
				ones++;
		}
		count = Math.max(ones, count);
		System.out.println(count);
		in.close();
	}
}
