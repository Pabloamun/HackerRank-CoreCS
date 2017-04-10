package basicProgrammingChallenges;

import java.util.*;

public class ServiceLane {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int TestCases = in.nextInt();
		List<Integer> width = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			width.add(in.nextInt());
		}
		for (int i = 0; i < TestCases; i++) {
			int start = in.nextInt();
			int end = in.nextInt();
			List<Integer> sublist = width.subList(start, end + 1);
			int type = sublist.contains(1) ? 1 : (sublist.contains(2) ? 2 : 3);
			System.out.println(type);
		}
		in.close();
	}
}
