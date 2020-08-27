import java.util.*;
class DnextGreterElement{   
    public static void main(String[] args){
        int a = 12347653;
        System.out.println(f(a));
    }    
public static int f( int a){
char[] b = (""+a).toCharArray();
// for( char ch : b)   System.out.print(ch+" ");
//     System.out.println();
    for( int i = b.length - 2; i >= 0; i--){
        
        if( b[i] < b[i+1]){
            int idx = -1;
            int min_ = Integer.MIN_VALUE;
            for( int j = i + 1; j <= b.length; j++){

                        if(j!=b.length && b[j] > b[i] ){
                        min_ = Math.min(min_, b[j]);
                        idx = j;
                    }
                    else{
                        //break here, bcz small no.s now
                        // swap
                        char temp = b[i];
                        b[i] = b[idx];
                        b[idx] = temp;
                        Arrays.sort(b, i+1, b.length);
                        //imp
                        //ascending order from i+1 to b.length-1
                        //for soring arr[]in descending order
                        // Arrays.sort(arr, Collections.reverseOrder()); 
                        //can also sort an array of any class c by using comparable there
                        //we always write long as Long and int as Integer in java
                        // long val = Long.parseLong(new String(b));
                        long val = Long.valueOf(new String(b));
                        return (val > Integer.MAX_VALUE) ? -1 : (int)val;
                    }
            } 
        }
    
    else{

        }
    }

    return -1;
    }
}