package basicProgrammingChallenges;

import java.util.Scanner;

public class AppendAndDelete {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		int k = in.nextInt();
		String equal = "";
		if (s.length() + t.length() < k) {
			System.out.println("Yes");
		} else {

			if (s.length() >= t.length()) {
				for (int i = 1; i <= t.length(); i++) {
					equal = t.substring(0, i);
					if (s.substring(0, i).equals(equal))
						continue;
					else {
						equal = t.substring(0, i - 1);
						break;
					}
				}
			} else {
				for (int i = 1; i <= s.length(); i++) {
					equal = s.substring(0, i);
					if (t.substring(0, i).equals(equal))
						continue;
					else {
						equal = s.substring(0, i - 1);
						break;
					}
				}
			}

			int sum = s.length() + t.length() - 2 * equal.length();
			String ans = (k == sum) ? "Yes"
					: ((k > sum && ((k - sum) % 2 == 0)) ? "Yes" : "No");
			System.out.println(ans);
		}
		in.close();
	}

}
