package basicProgrammingChallenges;

import java.util.*;

public class BeautifulTriplets {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(in.nextInt());
		}
		int count = 0;
		for (int num : a) {
			if (a.contains(num + d) && a.contains(num + 2 * d))
				count++;
		}
		System.out.println(count);
		in.close();
	}
}
