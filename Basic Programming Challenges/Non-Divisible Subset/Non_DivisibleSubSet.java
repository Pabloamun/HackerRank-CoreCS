package basicProgrammingChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class Non_DivisibleSubSet {

	private static int solve(int[] inputSet, int divisor) {
		int[] remainderList = new int[divisor];

		Arrays.stream(inputSet).forEach(element -> {
			remainderList[element % divisor] += 1;
		});

		int count = 0;

		for (int i = 0; i <= divisor / 2; i++) {
			if (i == 0) {
				if (remainderList[i] > 0)
					count++;
			} else if (i == divisor / 2 && (divisor % 2 == 0)) {
				count++;
			} else if (remainderList[i] > remainderList[divisor - i]) {
				count += remainderList[i];
			} else {
				count += remainderList[divisor - i];
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		System.out.println(solve(a, k));
	}
}
