package basicProgrammingChallenges;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		BigInteger factorialResult = BigInteger.valueOf(0);
		factorialResult = factorial(number);
		System.out.print(factorialResult);
		in.close();
	}

	static BigInteger factorial(int N) {
		BigInteger b = BigInteger.valueOf(N);
		if (N == 1)
			return b;
		else
			return b.multiply(factorial(N - 1));
	}
}
