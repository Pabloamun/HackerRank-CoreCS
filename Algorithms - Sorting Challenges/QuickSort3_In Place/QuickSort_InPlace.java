package sortingChallenges;

import java.util.Scanner;

public class QuickSort_InPlace {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] array = new int[s];
		for (int i = 0; i < s; i++) {
			array[i] = in.nextInt();
		}
		quickSort(array);
		in.close();
	}

	public static void quickSort(int[] array) {
		if (array != null) {
			quickSort(array, 0, array.length - 1);
		}
	}

	private static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pivotIndex = partition(array, start, end);
			printArray(array, 0, array.length - 1);
			quickSort(array, start, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, end);
		}
	}

	// Lomuto Partition scheme
	private static int partition(int[] A, int lo, int hi) {
		int pivot = A[hi];
		int i = lo - 1;
		for (int j = lo; j <= hi - 1; j++) {
			if (A[j] <= pivot) {
				i++;
				swap(A, i, j);
			}
		}
		swap(A, i + 1, hi);
		return i + 1;
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void printArray(int[] array, int start, int end) {
		if (start < end) {
			for (int i = start; i <= end; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
	}
}
