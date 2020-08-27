import java.util.HashMap;
public class BcountOfSubArrayDivByK {
    public static void main(String[] args){
          
        // int[] arr = {4, 5, 0, -2, -3, 1}; 
        // int k = 5;

        int[] arr = {-1,2,9};
        int k = 2;
        System.out.println(f( arr, k));
    }

    public static int f( int[] arr, int k){

        int[] psa = new int[arr.length];

        psa[0] = arr[0];
        for( int i = 1; i < arr.length; i++ ){
            psa[i] = psa[i-1] + arr[i];
        }

        for( int i = 0; i < arr.length; i++){
            psa[i] = psa[i] % k;
            //negative case handle
            if( psa[i] < 0){
                psa[i] += k;
            }
        }

        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0 , 1);
        for( int i = 0 ; i < arr.length; i++){
            if( hm.containsKey(psa[i]))
                {
                    ans += hm.get(psa[i]);
                    hm.put(psa[i], hm.get(psa[i]) + 1);
                }
            else
                {
                    hm.put(psa[i], 1);
                }
        }

        return ans;
    }

}