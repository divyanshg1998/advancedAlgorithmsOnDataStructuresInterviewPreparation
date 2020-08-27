import java.util.HashMap;
public class ASumOfArrayDivisibleByK {
    public static void main(String[] args){

        // int[] arr = { 2, 3, -1, 4, -5, 1, 6, -4, 3, 1, 4};
        int[] arr ={ 1, 1, 1};

        System.out.println(f(arr, 2));
   }

   public static int f( int[] arr, int k){

    int[] psa = new int[arr.length];//prefix sum array
    
    psa[0] = arr[0];
    for( int i = 1 ; i < psa.length; i++){
        psa[i] += psa[i-1] + arr[i] ;
    }

    int ans = 0;
    HashMap<Integer, Integer> hm = new HashMap<>();
    hm.put(0,1);

    for( int ii = 0 ; ii < psa.length ; ii++){
        if( hm.containsKey(psa[ii] - k)){
            ans += hm.get(psa[ii] - k);
            hm.put(psa[ii], hm.containsKey(psa[ii]) ? hm.get(psa[ii]) + 1 : 1);
        }
        else{
            hm.put(psa[ii], hm.containsKey(psa[ii]) ? hm.get(psa[ii]) + 1 : 1 );
        }
    }

    return ans;
   }
}