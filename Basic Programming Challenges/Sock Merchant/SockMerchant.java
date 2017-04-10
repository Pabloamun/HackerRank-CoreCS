package basicProgrammingChallenges;

import java.util.*;

public class SockMerchant {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for (int c_i = 0; c_i < n; c_i++) {
			int c = in.nextInt();
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		in.close();
		int count = 0;
		for (Integer value : map.values()) {
			if (value < 2)
				continue;
			else if (value % 2 == 0) {
				count += value / 2;
			} else {
				count += (value - 1) / 2;
			}
		}
		System.out.println(count);
	}
}
