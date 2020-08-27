import java.util.*;
public class CRotateTheArray {
    public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7};
    f(arr,3);
    
    for( int ele : arr){
        System.out.print( ele + " ");
    }System.out.println();

    }
    public static void reverse( int[] arr, int a, int b){
        while( a<b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;       
        a++;
        b--;
        }       
    }
    public static void f( int[] arr, int k){
        k = k % arr.length;
        k = k<0 ? k + arr.length : k;
        reverse( arr, 0 , arr.length - 1 -k);
        reverse( arr, arr.length - k, arr.length - 1);
        reverse( arr, 0 , arr.length-1);       
    }
}