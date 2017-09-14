package search;

import java.util.*;

public class GridlandMetro {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt(), m = scan.nextInt(), 
		k = scan.nextInt();
		long lampPostNumber = n * m;

		HashMap<Integer, ArrayList<int[]>> trainMap = new HashMap<>();
		for (int i = 0; i < k; i++) {
			int row = scan.nextInt(), startColumn = scan.nextInt(), endColumn = scan.nextInt();
			ArrayList<int[]> list = trainMap.containsKey(row) ? trainMap.get(row) : new ArrayList<>();
			list.add(new int[] { startColumn, endColumn });
			trainMap.put(row, list);
		}
		scan.close();

		long sum = trainMap.values().stream().mapToLong((list) -> { 
			Collections.sort(list, Comparator.comparing((int[] o) -> o[0]).thenComparing((int[] o) -> o[1]));
			long numberOfTrain = 0;
			int startIndex = list.get(0)[0], endIndex = list.get(0)[1];
			for (int i = 1; i < list.size(); i++) {
				int startIndex2 = list.get(i)[0], endIndex2 = list.get(i)[1];
				if (startIndex2 <= endIndex + 1) {
					if (endIndex2 >= endIndex)
						endIndex = endIndex2;
				} else {
					numberOfTrain += (endIndex - startIndex + 1);
					startIndex = startIndex2;
					endIndex = endIndex2;
				}
			}
			numberOfTrain += (endIndex - startIndex + 1);
			return numberOfTrain;
		}).sum();
		System.out.println(lampPostNumber - sum);
		
	}
}
