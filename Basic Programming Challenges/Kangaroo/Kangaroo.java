package basicProgrammingChallenges;

import java.util.Scanner;

public class Kangaroo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		if ((x1 > x2 && v1 > v2) || (x1 < x2 && v1 < v2)) {
			System.out.println("NO");
		} else {
			String answer = "NO";
			for (int i = 0; i < 10000; i++) {
				x1 += v1;
				x2 += v2;
				if (x1 == x2) {
					answer = "YES";
					break;
				}
			}
			System.out.println(answer);
		}
		in.close();
	}
}
