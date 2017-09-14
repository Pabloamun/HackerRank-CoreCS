package string_Challenges;

import java.util.*;

public class Caesar_Cipher {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String s = in.next();
        int K = in.nextInt();
        in.close();
        int diff = 0;
        if(K > 26){
            diff = K%26;
        }
        else diff = K;
        
        for(int i= 0; i<N;i++){
            int c = (int)s.charAt(i);
            if(c< 65) System.out.print((char)c);
            else if(c < 91){
                if(c+diff>90){
                    int sub = c + diff -90;
                    System.out.print((char)(sub+64));
                }else{
                    System.out.print((char)(c+diff));
                }
            }
            else if(c < 97) System.out.print((char)c);
            else if(c < 123){
                if(c+diff>122){
                    int sub = c + diff -122;
                    System.out.print((char)(sub+96));
                }
                else{
                System.out.print((char)(c+diff));
                }
            }
            else System.out.print((char)c);
        }   
    }
 
}
