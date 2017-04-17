package sortingChallenges;

import java.util.Scanner;

public class InsertionSort_Part1 {
	public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		int num = ar[ar.length - 1];
		int len = ar.length - 1;

		for (int i = len - 1; i >= 0; i--) {
			if (num < ar[i]) {
				ar[i + 1] = ar[i];
				printArray(ar);
			} else {
				ar[i + 1] = num;
				printArray(ar);
				break;
			}
		}
		if (ar[0] == ar[1]) {
			ar[0] = num;
			printArray(ar);
		}
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
