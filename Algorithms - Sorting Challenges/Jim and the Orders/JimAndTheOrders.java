package sortingChallenges;

import java.util.*;
import java.util.stream.Collectors;

public class JimAndTheOrders {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<Integer, Integer> orders = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			orders.put(i, (in.nextInt() + in.nextInt()));
		}
		Map<Integer, Integer> sortedOrders = sortByValue(orders);
		for (int key : sortedOrders.keySet()) {
			System.out.print(key + " ");
		}
		in.close();
	}

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(
			Map<K, V> map) {
		return map
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(
						Collectors.toMap(Map.Entry::getKey,
								Map.Entry::getValue, (e1, e2) -> e1,
								LinkedHashMap::new));
	}
}
