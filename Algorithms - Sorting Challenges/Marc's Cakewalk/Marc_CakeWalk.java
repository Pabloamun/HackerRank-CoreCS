package sortingChallenges;

import java.util.*;

public class Marc_CakeWalk {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] calories = new Integer[n];
		for (int calories_i = 0; calories_i < n; calories_i++) {
			calories[calories_i] = in.nextInt();
		}
		// your code goes here
		Arrays.sort(calories, Collections.reverseOrder());
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += calories[i] * Math.pow(2, i);
		}
		System.out.println(sum);
		in.close();
	}
}
