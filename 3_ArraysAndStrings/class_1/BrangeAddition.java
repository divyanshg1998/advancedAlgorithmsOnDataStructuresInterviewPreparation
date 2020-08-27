import java.util.*;
public class BrangeAddition {
    public static void main(String[] args){
        int [][] updates = {{1,3,2},{2,4,3},{0,2,-2}}; 
        int[] arr = f(5, updates);
        for( int ele : arr){
            System.out.print(ele + " ");        
        }
        System.out.println();        
    }

    public static int[] f( int k, int[][] arr){
        
        int[] temp = new int[k];
        for( int i = 0; i < arr.length ; i++){
            
            temp[arr[i][0]] = temp[arr[i][0]] + arr[i][2];
            if( arr[i][1] + 1 < k)
            temp[arr[i][1] + 1] = temp[arr[i][1] + 1] -arr[i][2];            
        }

        // int[] arr2 = new int[k];
        //IN JAVA WHEN CREATE AN ARRAY O(N) TIME
        //  WE INITIALISE THE ARRAY , O(N) TIME GOES AWAY
        
        for(int i = 1 ; i < temp.length; i++){
            temp[i] = temp[i] + temp[i-1] ; 
        }
        return temp;

    }
}