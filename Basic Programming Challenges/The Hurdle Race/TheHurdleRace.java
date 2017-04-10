package basicProgrammingChallenges;

import java.util.Scanner;

public class TheHurdleRace {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		int max_height = 0;
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
			if (height[height_i] > max_height) {
				max_height = height[height_i];
			}
		}
		// your code goes here
		int solution = (max_height > k) ? max_height - k : 0;
		System.out.println(solution);
		in.close();
	}
}
