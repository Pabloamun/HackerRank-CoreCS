package basicProgrammingChallenges;

import java.util.Scanner;

public class BreakingTheRecord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}
		// your code goes here
		int Max_score = score[0];
		int Min_score = score[0];
		int count_max = 0;
		int count_min = 0;
		for (int i = 1; i < n; i++) {
			if (score[i] > Max_score) {
				Max_score = score[i];
				count_max++;
			} else if (score[i] < Min_score) {
				Min_score = score[i];
				count_min++;
			}
		}
		System.out.println(count_max + " " + count_min);
		in.close();
	}
}
