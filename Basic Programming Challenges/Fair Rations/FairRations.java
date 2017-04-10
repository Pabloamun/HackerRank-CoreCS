package basicProgrammingChallenges;

import java.util.Scanner;

public class FairRations {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int B[] = new int[N];
		int previousOddNumber = -1;
		int count = 0;
		for (int B_i = 0; B_i < N; B_i++) {
			B[B_i] = in.nextInt();
			if (B[B_i] % 2 != 0) {
				if (previousOddNumber == -1) {
					previousOddNumber = B_i;
				} else {
					count += (B_i - previousOddNumber) * 2;
					previousOddNumber = -1;
				}
			}
		}

		System.out.println(previousOddNumber >= 0 ? "NO" : count);
		in.close();
	}
}
