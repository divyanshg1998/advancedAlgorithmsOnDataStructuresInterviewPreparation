import java.util.*;

public class CDomino {
    public static void main(String[] args){

        System.out.println(fillFully1(4));
        System.out.println(fillFully(4));
        System.out.println(fillFullyDp(30));

    }

    public static int fillFully1( int n){
       if( n == 0)  return 0;
       if( n == 1)  return 1;
       if( n == 2)  return 2;
       if( n == 3)  return 5;

       return fillFully1(n - 1) + p( n - 1) + fillFully1( n - 2);
    }

    public static int p( int n){
        if( n == 2)  return 2;
        
        return p( n - 1) + 2 * fillFully1( n - 2) ;
    }
 
    public static int fillFully ( int n ){

        if( n == 0) return 0;
        if( n == 1) return 1;
        if( n == 2) return 2;
        if( n == 3) return 5;

        return fillFully( n - 3) + 2 * fillFully( n - 1);  

    }
    
    public static int fillFullyDp( int n){
                
        if( n == 0) return 0;
        if( n == 1) return 1;
        if( n == 2) return 2;
        if( n == 3) return 5;
        
        // base case, or out of bound exception
        int[] arr = new int[n + 1];//bcz the pow function returns double value
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 5;
        
        // for( int i = 4 ; i < arr.length; i++){
        //     arr[i] = 2 * arr[i - 1] + arr[i - 3];
        // }
        
        for( int i = 4 ; i < arr.length; i++){
            // int m = ((2 * arr[i - 1]) % ( Math.pow(10, 9) + 7)) 
            // +  arr[i - 3] ;
            arr[i] = (int)((((2* arr[i - 1]) % ( Math.pow(10, 9) + 7)) 
            +  arr[i - 3]) %  ( Math.pow(10, 9) + 7) );
            }
           
           //we type-cast to arr[i] as int as power function always return
           //double , therefore to degrade it is imp else error 
          
        

      return arr[arr.length - 1];  
        
    }
}