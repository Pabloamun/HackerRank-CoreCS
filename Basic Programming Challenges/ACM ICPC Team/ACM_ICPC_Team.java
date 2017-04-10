package basicProgrammingChallenges;

import java.util.*;

public class ACM_ICPC_Team {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int person = in.nextInt();
		int topics = in.nextInt();
		List<String> personList = new ArrayList<>();
		int max_topics = -1;
		int team = 0;

		for (int i = 0; i < person; i++) {
			personList.add(in.next());
		}
		String s1, s2;
		in.close();
		for (int i = 0; i < personList.size() - 1; i++) {
			s1 = personList.get(i);
			for (int j = i + 1; j < personList.size(); j++) {
				s2 = personList.get(j);
				int temp = 0;
				for (int k = 0; k < topics; k++) {
					if ((s1.charAt(k) | s2.charAt(k)) == '1') {
						temp++;
					}
				}
				max_topics = Math.max(max_topics, temp);
			}
		}
		System.out.println(max_topics);

		for (int i = 0; i < personList.size() - 1; i++) {
			s1 = personList.get(i);
			for (int j = i + 1; j < personList.size(); j++) {
				s2 = personList.get(j);
				int temp = 0;
				for (int k = 0; k < topics; k++) {
					if ((s1.charAt(k) | s2.charAt(k)) == '1') {
						temp++;
					}
				}
				team = (max_topics == temp) ? team + 1 : team;
			}
		}
		System.out.println(team);
	}
}
