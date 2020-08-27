import java.util.*;
public class DtrappingRainWater {
    public static void main(String[] args){ 
        // 2.
        int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
            // System.out.println(f(arr));
            System.out.println(f1(arr));
    }    
    public static int f(int[] arr) {
        // GHHJJKVVKGHHBBBBBBBBKHBJBBKJLHLKHKHJHKHKHKHKH
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];
        int l = rightMax.length;
        for( int i = 1 ; i < arr.length; i++){
            leftMax[i] = Math.max( leftMax[i-1], arr[i-1]);
            rightMax[l - 1 - i] = Math.max(rightMax[l - 1 - i + 1],arr[l - 1 - i + 1]); 
        }
                
        // for( int i = 0 ; i < l; i++){
        //     System.out.print(leftMax[i] + " ");
        // }        System.out.println();
        // for( int i = 0 ; i < l; i++){
        //     System.out.print(rightMax[i] + " ");
        // }        System.out.println();
    
        int ans = 0;    //inititalise int variable for 0, not itself
        for( int i = 0 ; i < l; i++){
            if( Math.min(leftMax[i], rightMax[i]) > arr[i]){
                ans += Math.min(leftMax[i], rightMax[i]) - arr[i];
            }
        }
        return ans;
    }        

    public static int f1( int[] arr){
        int i = 0 , j = arr.length - 1;
        int ans = 0;// num = arr.length - 1;
        int leftMax = 0, rightMax = 0;
        while( i<=j){
            if( arr[i] < arr[j]){
                int cans = Math.min(leftMax,rightMax) - arr[i];
                if( cans > 0){
                    ans+=cans;
                     }
                leftMax = Math.max( leftMax, arr[i]); 
                i++;
                }
            else //if( arr[i] >= arr[j])
            {
                int cans = Math.min(leftMax,rightMax) - arr[j];
                if( cans > 0){
                    ans+=cans;
                    }
                rightMax = Math.max( rightMax, arr[j]); 
                j--;
                }
       }

       return ans;
    }
}