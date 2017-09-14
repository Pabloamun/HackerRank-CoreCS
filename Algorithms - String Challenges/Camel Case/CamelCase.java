package string_Challenges;
import java.util.*;

public class CamelCase {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        for(int i= 1; i< s.length();i++){
            int num = (int)s.charAt(i);
            if(num >64 && num < 91) count++;
        }
        System.out.println(count);
        in.close();
    }
}
