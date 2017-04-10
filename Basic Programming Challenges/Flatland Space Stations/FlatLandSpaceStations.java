package basicProgrammingChallenges;

import java.util.*;

public class FlatLandSpaceStations {

	private static int solution(int[] arr, int n) {
		Arrays.sort(arr);
		int maxDistance = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int distance = (arr[i] - arr[i - 1]) / 2;
			if (maxDistance < distance)
				maxDistance = distance;
		}
		int lastGap = (n - 1) - arr[arr.length - 1];
		return (lastGap < maxDistance) ? maxDistance : lastGap;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] stations = new int[m];
		for (int i = 0; i < m; i++) {
			stations[i] = in.nextInt();
		}
		System.out.println(solution(stations, n));
		in.close();
	}
}
