import java.util.*;
public class BSquaresofSortedArray {
    public static void main(String[] args){
        int[] a = {-7,-3,2,3,11};
        int[] b = f(a);
        for( int c : b){
            System.out.print(c+" ");
        }
    }         
    public static int[] f(int[] arr){
        int[] a1 = new int[arr.length];
        int i = 0, j = arr.length - 1;
        int k = a1.length - 1;
        while( i <= j){
            int val = arr[i] > 0 ? arr[i] : -arr[i];
            if( val < arr[j] ){
                a1[k] = arr[j]*arr[j];
                j--;k--;
            } 
            else{
                a1[k] = val* val;
                i++; k--;
            }
        }
    return a1;
    }
}