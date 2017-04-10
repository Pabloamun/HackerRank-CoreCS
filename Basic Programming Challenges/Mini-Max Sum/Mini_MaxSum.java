package basicProgrammingChallenges;

import java.util.*;

public class Mini_MaxSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] numbers = new long[5];
		for (int i = 0; i < 5; i++) {
			numbers[i] = in.nextLong();
		}
		in.close();
		Arrays.sort(numbers);
		long Max = 0;
		long Min = 0;
		for (int i = 1; i < 5; i++) {
			Max += numbers[i];
		}
		for (int i = 0; i < 4; i++) {
			Min += numbers[i];
		}
		System.out.println(Min + " " + Max);
	}
}
