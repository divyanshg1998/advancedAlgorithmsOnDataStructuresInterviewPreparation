import java.util.*;
public class AMaximumSwap {
    public static void main(String[] args){
       //leave this question
       
        System.out.println(f(96478));
    }    

    static int f( int a){

        char[] b = (""+a).toCharArray();
        // boolean found = false;
        for( char ch :b)     System.out.print( ch + " ");
        System.out.println();
        int num = -1 , idx = -1, max = -1;
        //use -1 for initialisaion
        int i = 1;
        for( i = 1; i < b.length; i++){
            
            System.out.println(b[i] + " " + b[i-1]);
            if( b[i] > b[i-1]){
                num = i-1;
                idx = -1;
                for( int j = i ; j < b.length; j++){
                    if( b[j] >= max){
                        max = b[j];
                        idx = j;
                    }
                }
                break;
            }
        }
        
        // int min = Integer.MIN_VALUE;
        for(  i = 0; i <= num ; i++){
            if( b[i] < max){
                swap(b,i,idx);
                break;
            }
        }

        return Integer.valueOf(new String(b));
     }

     static void swap( char[] a, int i , int j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
     }
    }
