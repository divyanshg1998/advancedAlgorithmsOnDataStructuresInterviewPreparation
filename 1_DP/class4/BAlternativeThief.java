
public class BAlternativeThief {

    public static void main(String[] args){
        int[] arr = {2,7,9,3,1};
        System.out.println(fun(arr));

    }
    
    public static int fun(int[] arr){

        int inc = arr[0];
        int exc = 0;
        int n = 1;

        while( n < arr.length){
            int newInc = exc + arr[n];
            exc = Math.max(inc, exc);
            inc = newInc;
            n++;
        }
 
        return Math.max(inc , exc);
    }

}