package basicProgrammingChallenges;

import java.util.*;

public class SequenceEquation {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			numbers.add(in.nextInt());
		}
		for (int i = 1; i <= n; i++) {
			int index = numbers.indexOf(i) + 1;

			System.out.println(numbers.indexOf(index) + 1);
		}
		in.close();
	}
}
