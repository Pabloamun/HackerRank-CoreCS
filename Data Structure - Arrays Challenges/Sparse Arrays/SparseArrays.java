package ds_Arrays;

import java.util.*;

public class SparseArrays {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[] listOfStrings = new String[N];
		for (int i = 0; i < N; i++) {
			listOfStrings[i] = in.next();
		}
		int Q = in.nextInt();
		while (Q-- > 0) {
			String query = in.next();
			int count = 0;
			for (String m : listOfStrings) {
				count = (m.equals(query) ? count + 1 : count);
			}
			System.out.println(count);
		}
		in.close();
	}
}
