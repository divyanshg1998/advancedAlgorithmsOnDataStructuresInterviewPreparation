import java.util.*;
public class EOrderlyQueue {
    public static void main(String[] args){
        System.out.println(f("aadbacb",2));
        String a = "abc", b = "bcd", c = "acd";
        System.out.println( a.compareTo(b));
        System.out.println( b.compareTo(a));
        System.out.println( c.compareTo(a));

    } 

    public static String f(String S, int k) {
        if( k >= 2){
            char[] arr = S.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
            //make char arr to string
        }
        else{
            // str1.compareTo(str2); it returns lexographically compared str1 and str2 according to ascii value     if str1 < str2 , then -ve 
          // else str1 > str2 , then +ve
            String ans = S;
            for( int i = 0 ; i < S.length() ; i++){
                S = S.substring(1) + S.substring(0,1);// 1 se end tak, 0 se 0, 
                // System.out.println(S);
                if( ans.compareTo(S) > 0){
                    ans = S;
                }
            }
            return ans;            
    }
}    
}