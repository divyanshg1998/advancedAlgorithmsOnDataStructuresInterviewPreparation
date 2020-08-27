import java.util.*;
public class ApairSumDivisibleByK {

    //count of pair whose sum divisible by k
    public static void main(String[] args){

        // System.out.println(((-45)%4) + " " + ((-45)/5));
        // ans: -1 , -9
        int[] arr = {2, 2, 1, 7, 5, 3}; 
        System.out.println(f(arr, 4));
    }
    
    public static int f( int[] arr, int k){
        //cant remove an element with keySet loop, gives error, for hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for( int ele:arr){
            int rem = ele % k;
            if(rem < 0 )    rem += k;    //handle case -ve
            hm.put(rem , hm.getOrDefault(rem, 0) + 1);
        }

        // hm.remove(10);

        int ans=0;
        ArrayList<Integer> al = new ArrayList<>(hm.keySet());
        //cant remove with keySet loop, gives error 
        for( int i : al){
            System.out.println(i+ " "+ hm.get(i) + ans);
            if(i==0){
                ans += (hm.get(i) * (hm.get(i) - 1))/(2 * 1);//nC2,combination
            }
            else if( i == k/2 && k%2 == 0){
                ans += hm.get(k/2) * (hm.get(k/2) - 1)/2;//nC2
                //left to right for same prio operator
                // * / %                                                            
            }
            else{
                ans += hm.get(i) * hm.getOrDefault(k-i, 0);
                hm.remove(i);
                //cant remove with keySet loop, gives error
            } 
        }
        
        return ans;
    }
}