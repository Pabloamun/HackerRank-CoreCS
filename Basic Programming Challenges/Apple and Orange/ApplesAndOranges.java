package basicProgrammingChallenges;

import java.util.Scanner;

public class ApplesAndOranges {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		int count_apples = 0;
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
			if (a + apple[apple_i] >= s && a + apple[apple_i] <= t)
				count_apples++;
		}
		int[] orange = new int[n];
		int count_oranges = 0;
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
			if (b + orange[orange_i] >= s && b + orange[orange_i] <= t)
				count_oranges++;
		}
		System.out.println(count_apples);
		System.out.println(count_oranges);
		in.close();
	}
}
