package basicProgrammingChallenges;

import java.util.Scanner;

public class BonAppetit {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] items = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			items[i] = in.nextInt();
			if (i == k)
				continue;
			else
				count += items[i];
		}
		int b_charge = in.nextInt();
		if (count / 2 == b_charge)
			System.out.println("Bon Appetit");
		else
			System.out.println(b_charge - (count / 2));
		in.close();
	}
}
