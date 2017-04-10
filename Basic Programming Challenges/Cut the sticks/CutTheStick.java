package basicProgrammingChallenges;

import java.util.*;

public class CutTheStick {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.println(n - i);
			}
		}
		in.close();
	}
}
