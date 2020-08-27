import java.util.*;
public class ESmallestNoMultiply {
    public static void main(String[] args){
        
        System.out.println(Integer.MAX_VALUE);  
        System.out.println(f(1000000000));
    }
    

    public static long f( int n){

        //base
        if( n ==1 )     return 1;

        long ans = 0 , j = 1;
        for( int i  = 9 ; i >= 2 ; i--){
            while( n % i == 0){
        //can interchange both the loops like here
        //for better approach
                n = n/i;
                ans = ans + i * j;
                j *= 10;
            }      
        }
        
        return n > 1 ? -1 : ans;
    }
}