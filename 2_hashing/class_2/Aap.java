import java.util.*;

public class AP {

    public static void main(String[] args){
        int[] arr = {0, 12, 4, 8, 16};
        // System.out.println("h0");

        System.out.println(f(arr));

    }
    public static boolean f( int[] arr){
        int min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;
        HashSet<Integer> hs = new HashSet<>();

        for( int i = 0; i < arr.length; i++){
            
            hs.add(arr[i]);
            if(  arr[i] < min ) { 
                smin  = min;// first this line, will be there
                min = arr[i];//imp
            }
            else if( arr[i] < smin )    
                smin = arr[i]; //&& arr[i] > smin
        }


        int d = smin - min;
        int num = smin;
        
        if(d != 0){
        
            for( int i = 2; i < arr.length ; i++){
            num += d;
            if( hs.contains(num)){

            }
            else{
                return false;
            }
          }
        }
        else if( d == 0)
        {
            for( int i = 0; i < arr.length ; i++){
                 if( arr[i] != smin)
                        return false;
            }
        }    
            return true;        

        }

    }
// OUTPUT
// 8
// 12
// 16
// true
