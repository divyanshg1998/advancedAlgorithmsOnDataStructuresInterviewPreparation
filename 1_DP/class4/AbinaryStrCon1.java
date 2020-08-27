import java.util.*;

public class AbinaryStrCon1 {

    public static void main(String[] args){
    //print the 
    System.out.println(fun(8));
    System.out.println(fun2Better(8));
    }


public static int fun( int n){

    if( n == 0){
        return 0;
    }
    
    int nn = n, ctr = 0;
    while( nn != 0 ){
        nn/=2;
        ctr++;
    }

    int a0 = 1;
    int a1 = 1;
    int i = 1;

    while( i < ctr ){

    int newa0 = a0 + a1;
    a1 = a0;
    a0 = newa0;
    i++;

    }

    return a0 + a1;
}


public static void fun2Better( int [] arr){

    //we using directly fibonacci series here
    //only two variables decrease
    // but for high input like 1,00000000
    // one variables also big Time Limit Error

    int arrPointer = 0;
        if( arr[0] == 0){
        System.out.println("0") ;
        arrPointer++;
        }

    if( arr[arrPointer] == 1){
        System.out.println("2") ;
        arrPointer++;        
    }

int a = 1;
int b = 2;
int i = 1;

while( arrPointer < arr.length ){

 int num = (int)Math.pow(10,9) + 7;

int c = (a + b) % num;
a = b;
b = c;
i++;

if( arr[arrPointer] == i){
    System.out.println(c);
    arrPointer++;
}

}
	
}

}