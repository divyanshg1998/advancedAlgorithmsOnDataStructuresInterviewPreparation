import java.util.*;
public class B2KeyKeyBoard {

    public static void main(String[] args){

        System.out.println(f(360));
        System.out.println(f(81));
   }

    public static int f( int n){

        if( n == 1)        return 0;

        int n1 = n/2;
        for( int i = n1 ; i >= 1 ; i--){
            if( n%i == 0){
                return f(i) + (n/i);
            }
        }
        return Integer.MIN_VALUE;
    }

}