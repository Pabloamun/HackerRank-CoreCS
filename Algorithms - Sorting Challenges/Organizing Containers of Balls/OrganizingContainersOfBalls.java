package sortingChallenges;

import java.util.Scanner;

public class OrganizingContainersOfBalls {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int n = in.nextInt();
			int[] containers = new int[n];
			int[] types = new int[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int num = in.nextInt();
					containers[i] += num;
					types[j] += num;
				}
			}
			boolean flag = true;
			for (int i = 0; i < n; i++) {
				int j = 0;
				for (j = i; j < n; j++) {
					if (containers[i] == types[j]) {
						int temp = types[j];
						types[j] = types[i];
						types[i] = temp;
						break;
					}
				}
				if (j == n) {
					flag = false;
					break;
				}
			}
			System.out.println((flag) ? "Possible" : "Impossible");
		}
		in.close();
	}
}
