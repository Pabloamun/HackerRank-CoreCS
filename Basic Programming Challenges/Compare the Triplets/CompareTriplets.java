package basicProgrammingChallenges;

import java.util.Scanner;

public class CompareTriplets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			b[i] = in.nextInt();
		}
		int Alice = 0;
		int Bob = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i] == b[i])
				continue;
			else if (a[i] > b[i])
				Alice++;
			else
				Bob++;
		}
		System.out.println(Alice + " " + Bob);
		in.close();
	}
}
