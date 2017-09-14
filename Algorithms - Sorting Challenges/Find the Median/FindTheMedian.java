package sortingChallenges;
import java.util.*;

public class FindTheMedian {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]  = in.nextInt();
        }
        in.close();
        Arrays.sort(arr);
        System.out.println(arr[n/2]);
    }
}
