package basicProgrammingChallenges;

import java.util.Scanner;

public class DesignerPDFViewer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] h = new int[26];
		for (int h_i = 0; h_i < 26; h_i++) {
			h[h_i] = in.nextInt();
		}
		String word = in.next();
		String letter = "abcdefghijklmnopqrstuvwxyz";
		int max = 0;
		for (int i = 0; i < word.length(); i++) {
			int num = letter.indexOf(word.charAt(i));
			int temp = h[num];
			max = (temp > max) ? temp : max;
		}
		System.out.println(max * word.length());
		in.close();
	}
}
