package basicProgrammingChallenges;

import java.util.Scanner;

public class DrawingBook {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		// your code goes here

		if (n / 2 < p) {
			int pages = 0;
			for (int i = n - 1; i > p; i -= 2) {
				pages++;
			}
			System.out.println(pages);
		} else {
			int pages = 0;
			for (int i = 1; i < p; i += 2) {
				pages++;
			}
			System.out.println(pages);
		}
		in.close();
	}
}
