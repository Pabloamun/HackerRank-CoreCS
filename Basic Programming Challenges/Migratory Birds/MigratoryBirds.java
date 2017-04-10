package basicProgrammingChallenges;

import java.util.Scanner;

public class MigratoryBirds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] types = new int[n];
		for (int types_i = 0; types_i < n; types_i++) {
			types[types_i] = in.nextInt();
		}
		// your code goes here
		System.out.println(CountingTypes(types));
		in.close();
	}

	static int CountingTypes(int[] types) {
		int[] count_types = new int[5];
		for (int i = 0; i < types.length; i++) {
			switch (types[i]) {
			case 1:
				count_types[0]++;
				break;
			case 2:
				count_types[1]++;
				break;
			case 3:
				count_types[2]++;
				break;
			case 4:
				count_types[3]++;
				break;
			case 5:
				count_types[4]++;
				break;
			default:
				System.out
						.println("This type of bird is not valid, please introduce the correct type");
				break;
			}
		}
		int max = count_types[0];
		int index = 0;
		for (int i = 1; i < 5; i++) {
			if (count_types[i] > max) {
				max = count_types[i];
				index = i;
			}
		}
		return index + 1;
	}

}
