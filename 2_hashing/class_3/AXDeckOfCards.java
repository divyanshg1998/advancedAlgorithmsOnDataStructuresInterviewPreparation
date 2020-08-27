import java.util.*;
// import sun.launcher.resources.launcher;
public class AXDeckOfCards {
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,2,3,3};
        System.out.println(f(arr));
        
    }

    public static boolean f( int[] arr){

        HashMap<Integer, Integer> hm = new HashMap<>();
        for( int ele: arr){
            hm.put(ele,hm.getOrDefault(ele, 0) + 1);
        }  
        
        //FIRST 2 ELEMENT IS BEING HANDLED ALREADY HERE 
        //IN THE LOOP
        //NO NEED FOR SEPARATE HANDLE
        // CAN MOSTLY HANDLE THE FIRST CASES IN THE LOOP ITSELF
        // int fiEl = hm.get(arr[0]);//first Ele
        // if( arr.length == 1)    return false;
        // int seEl = arr[1];//second ele
        // int j = 2;

        int myGcd = -1;
         for( int ele : hm.keySet()){

            if(myGcd == -1)   myGcd = hm.get(ele); 
            else    myGcd = gcd( myGcd, hm.get(ele));                
           
            System.out.println( ele + ": " + hm.get(ele) + " " + myGcd );
            }

         return myGcd >= 2;
        

        }

public static int gcd( int a , int b){
    System.out.println("hh");
    if( b == a)   return b;
    if( b > a)   {
        int rtemp = a;
        a=b;
        b=rtemp;
    }

    while( (a % b) != 0){
        int temp = a%b;
        a = b;
        b = temp;

        System.out.println("h2" + a + " "+ b + " " +temp);
    }
    return b;
}
}