package basicProgrammingChallenges;

import java.util.*;

public class ElectronicsShop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int[] keyboards = new int[n];
		for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
			keyboards[keyboards_i] = in.nextInt();
		}
		int[] pendrives = new int[m];
		for (int pendrives_i = 0; pendrives_i < m; pendrives_i++) {
			pendrives[pendrives_i] = in.nextInt();
		}
		in.close();
		List<Integer> buys = new ArrayList<>();
		for (int key : keyboards) {
			for (int pen : pendrives) {
				if (pen + key <= s)
					buys.add(pen + key);
			}
		}
		if (buys.isEmpty())
			System.out.println(-1);
		else {
			Collections.sort(buys);
			System.out.println(buys.get(buys.size() - 1));
		}
	}
}
