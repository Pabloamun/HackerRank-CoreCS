package ds_Arrays;

import java.util.*;

public class Dynamic_Array {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lastans = 0;
		int N = in.nextInt();
		int Q = in.nextInt();
		int tag, x, y, index;

		ArrayList<Integer>[] list = new ArrayList[N];
		while (Q-- > 0) {
			tag = in.nextInt();
			x = in.nextInt();
			y = in.nextInt();
			index = (x ^ lastans) % N;

			switch (tag) {

			case 1:
				if (list[index] == null) {
					ArrayList<Integer> myList = new ArrayList<>();
					myList.add(y);
					list[index] = myList;
				} else
					list[index].add(y);
				break;
			case 2:
				System.out.println(lastans = list[index].get(y
						% list[index].size()));
				break;
			}
		}
		in.close();
	}
}
