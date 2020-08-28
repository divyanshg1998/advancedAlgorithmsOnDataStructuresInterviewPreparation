import java.util.*;
public class rotate90_2d {
    public static void main(String[] args){
        int[][] arr ={
        { 5, 1, 9,11},
        { 2, 4, 8,10},
        {13, 3, 6, 7},
        {15,14,12,16}
    };

    f(arr);   
    for(int[] a: arr){
        for( int b : a){
            System.out.print(b+" ");
        }
        System.out.println();
    }

}
static void f( int[][] arr){
    for( int i = 0 ; i < arr.length; i++){
        for( int j = 0 ; j < i; j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }
    
    for( int j = 0; j < arr[0].length / 2 ; j++){
        for( int i = 0 ; i < arr.length; i++){
            int t = arr[i][j];
            arr[i][j] = arr[i][arr[0].length - 1 - j];
            arr[i][arr[0].length - 1 - j] = t;
        }
    }
}

}