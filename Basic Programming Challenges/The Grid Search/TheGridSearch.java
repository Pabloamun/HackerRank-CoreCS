package basicProgrammingChallenges;

import java.util.Scanner;

public class TheGridSearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String[] G = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String[] P = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}

			boolean flag = false;
			for (int row = 0; row < R - r + 1 && !flag; row++) {
				for (int col = 0; col < C - c + 1 && !flag; col++) {
					if (P[0].equals(G[row].substring(col, col + c))) {
						flag = isMatch(G, P, row, col);
					}
				}
			}
			if (flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}

	public static boolean isMatch(String[] G, String[] P, int row, int col) {
		for (int i = 0; i < P.length; i++) {
			if (!G[i + row].substring(col, col + P[0].length()).equals(P[i])) {
				return false;
			}
		}
		return true;
	}
}
