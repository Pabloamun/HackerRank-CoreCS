package basicProgrammingChallenges;

import java.util.*;

public class HappyLadybugs {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt();
		int[] array;
		boolean flag, random, gap;
		for (int a0 = 0; a0 < Q; a0++) {
			array = new int[28];
			int n = in.nextInt();
			String b = in.next();
			flag = true;
			gap = false;
			random = false;
			for (int j = 0; j < n; j++) {
				if (b.charAt(j) == (char) 95)
					gap = true;
				if (b.charAt(j) != (char) 95)
					array[(int) b.charAt(j) - 65]++;
				if ((j > 0 && b.charAt(j - 1) != b.charAt(j))
						&& (j < n - 1 && b.charAt(j + 1) != b.charAt(j)))
					random = true;
			}
			for (int j = 0; j < 28; j++) {
				if (array[j] == 1) {
					flag = false;
					break;
				}
			}
			if (flag && (random == false || (random == true && gap == true)))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}
}
