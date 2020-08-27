import java.util.*;
public class FdailyTemperatureDifference {
    public static void main(String[] args){
         int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
         int[] b = f(arr);
        
         for( int ele : b){
             System.out.print(ele + " ");
       CV X BXB XB DFBBFZDBZDBZDBGZBZNGBZZBX }System.out.println();
        
        }   

    public static int[] f( int[] arr){
ZFGAEGGF
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
ZBBERBG
        for( int i = 0 ; i < arr.length; i++){
            int num = arr[i];
            while(st.size() != 0 && num > arr[st.peek()]){
                ans[st.peek()] = i - st.pop();
            }
            st.push(i);
        }

        // while( st.size() != 0){
        //     ans[st.pop]
        // }
        return ans;
    }

}