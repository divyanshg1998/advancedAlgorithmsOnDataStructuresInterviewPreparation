import java.util.*;
public class Amultiply2Strings {
    public static void main(String[] args){
        //very imp and tough programme
        // int a = (int)('0');
        // a = 47 here //convert char to int
        //we get ascii value in int not actual value;
        // System.out.println(a);
        System.out.println(f("123","45"));
        System.out.println((123*45));
    
    }
    static String f( String s1, String s2){
        // case handle in base 
        // if s1 = 322 s2 = 0   ans coming = "000" wanted "0"
        if( s1.equals("0") || s2.equals("0"))   return "0";
        
        int[] arr = new int[s1.length() + s2.length()];
        for( int j = s2.length() - 1 ; j >=0; j--){
            for( int i = s1.length() - 1; i>=0 ; i--){
                int idx1 = i + j;
                int idx2 = i + j + 1;   
                int prod = (int)(s1.charAt(i)-'0')*(int)(s2.charAt(j)-'0');
                int ans = prod + arr[idx2];
                // System.out.println( j + "*" + i + " " + prod + " " + ans);
                arr[idx2] = ans % 10;
                arr[idx1] += ans / 10;
            }
        }

        StringBuilder sb = new StringBuilder();// no <> here
       for( int ele : arr){
        // System.out.print(ele + " ");   
        sb.append(ele);
       }

       if( sb.charAt(0) == '0') sb.deleteCharAt(0);//case
       // System.out.println(sb);
       return sb.toString() ;
        }
}
