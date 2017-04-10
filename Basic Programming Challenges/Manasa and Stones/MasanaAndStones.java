package basicProgrammingChallenges;

import java.util.*;
import java.util.stream.Collectors;

public class MasanaAndStones {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while (testCases-- > 0) {
			int stones = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			int max = Math.max(a, b);
			int[] sol = new int[stones];
			for (int i = 0; i < stones; i++) {
				sol[i] = (stones - 1) * max - i * Math.abs(b - a);
			}
			Set<Integer> solution = Arrays.stream(sol).boxed()
					.collect(Collectors.toSet());
			Object[] masana = solution.toArray();
			Arrays.sort(masana);
			for (Object num : masana) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
