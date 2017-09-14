package search;

import java.util.*;

public class LonelyInteger {

    static int lonelyinteger(int[] a) {
        // Complete this function
        int k = 0;
        for(int i = 0; i< a.length;i++){
            if(a[i] == 1) k= i;
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] frequent = new int[101];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            frequent[a[a_i]] += 1;
        }
        int result = lonelyinteger(frequent);
        System.out.println(result);
        in.close();
    }
}
