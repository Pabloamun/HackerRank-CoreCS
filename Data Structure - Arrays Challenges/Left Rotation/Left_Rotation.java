package ds_Arrays;

import java.util.*;

public class Left_Rotation {
	static int[] leftRotation(int[] a, int d) {
		// Complete this function
		int len = a.length;
		int[] array = new int[len];
		for (int i = 0; i < len; i++) {
			array[(i + len - d) % len] = a[i];
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] result = leftRotation(a, d);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
