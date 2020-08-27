import java.util.*;
public class D_kthSmallestElement {
    
    public static class c implements Comparable<c>{
        int val;
        int i;
        int j;
        c(){}
        c(int vall,int ii, int jj ){
            val = vall;
            i = ii;
            j = jj;
        }
        @Override
        public int compareTo(c other){
            return this.val - other.val;
        }
    }
        
    public static class c2{
        int val;
        int i;
        int j;
        c2(){}
        c2(int vall,int ii, int jj ){
            val = vall;
            i = ii;
            j = jj;
        }
     }
    public static void main(String[] args){
        int[][] arr = {
            { 1,  5,  9},
            {10, 11, 13},
            {12, 13, 15}
         };
         int k = 8;
         double kk = 8/8.8; 
         System.out.println(kk);
         System.out.println(f(arr,k));
    }

    public static int f( int[][] arr, int k){
        
        //two ways to write for priority queue,
        //first
        //second, lambda function
        // PriorityQueue<c> pq = new PriorityQueue<>();
        PriorityQueue<c2> pq = new PriorityQueue<>((n1,n2) -> n1.val - n2.val);

        // long a = 5.0/3.0;
        long a = 5;
        System.out.println(a);
        for( int i = 0 ; i < arr.length; i++){
            pq.add( new c2(arr[i][0], i, 0));
        }

        int i = 0;
        c2 myVar = new c2();
        while( i != k){
            myVar = pq.remove();
            // System.out.println(i + ". "+ myVar.val + " " + myVar.i + " " + myVar.j);
            if( myVar.j + 1 < arr[0].length )     
            {    pq.add(new c2(arr[myVar.i][myVar.j+1], myVar.i, myVar.j+1));
            }
                i++;
        }
        return myVar.val;
    }
}