package sortingChallenges;

import java.util.Scanner;

public class InsertionSort_Part2 {

	public static void insertionSortPart2(int[] ar) {
		// Fill up the code for the required logic here
		// Manipulate the array as required
		// The code for Input/Output is already provided
		int len = ar.length;
		for (int i = 1; i < len; i++) {
			int value = ar[i];
			int index = i;
			while (index > 0 && ar[index - 1] > value) {
				ar[index] = ar[index - 1];
				index--;
			}
			ar[index] = value;
			printArray(ar);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);
		in.close();

	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}