package basicProgrammingChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class EqualizeTheArray {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		int[] frequencies = new int[101];
		for (int i = 0; i < n; i++) {
			frequencies[A[i]]++;
		}
		Arrays.sort(frequencies);
		System.out.println(A.length - frequencies[frequencies.length - 1]);
		in.close();
	}
}
