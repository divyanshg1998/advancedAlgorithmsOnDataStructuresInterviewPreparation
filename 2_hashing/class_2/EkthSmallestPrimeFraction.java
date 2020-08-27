import java.util.*;
public class EkthSmallestPrimeFraction {
    public static class c implements Comparable<c>
        {
        double val = 0;
        int i = 0;
        int j = 0;
        c(){}
        c(double vall, int ii, int jj){
            val = vall;
            i = ii;
            j = jj;
        }     

        @Override   
        public int compareTo( c other){
            if( this.val > other.val)   return 1;
            else if( this.val < other.val)  return -1;
            else    return 0;
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5};
        int k = 3;
        System.out.println(f(arr,k));
    }
    public static String f( int[] arr, int k){
        //try to use comparable syntax because fast and efficeint
        //works most of the time at ease
        PriorityQueue<c> pq = new PriorityQueue<>();       
        //below pposecc is not time efficient
        // PriorityQueue<c> pq = new PriorityQueue<>((n1,n2) ->
        //                 Double.compare(n1.val, n2.val));
        //cant write with a comparator here like
        // (n1,n2) ->
        // if ( n1.val < n2. val)   -1;
        // else if( n2.val > n1.val)    1;
        // else  0;
        // );
        for( int i = 0 ; i < arr.length; i++){
            pq.add(new c((double)(arr[i]) / (arr[arr.length - 1]), i,arr.length - 1));    
        }

        int i = 0;
        c val = new c();

        while( i != k){
            val = pq.remove();
            System.out.println(i+ ". " + arr[val.i] + " "+ arr[val.j]);
            if( val.i + 1 != val.j)     
                pq.add( new c( (double)(arr[val.i]) / (double)(arr[val.j - 1]),
                val.i, val.j - 1 ));
            i++;
        }        

        return "[" + arr[val.i] +", "+ arr[val.j] + "]";
    }
}