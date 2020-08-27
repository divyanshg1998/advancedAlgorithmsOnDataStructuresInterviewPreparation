import java.util.*;
public class GstockSpan {
    public static void main(String[] args){
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int[] b = f( arr);
        for( int ele : b){
            System.out.print(ele + " ");
        }
    }
    
    public static int[] f( int[] arr){
    
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for( int i = 0 ; i < arr.length ; i++){
            int num = arr[i]; 
            while( st.size() != 0 && arr[st.peek()] <= num){
            // equal to important in above
                st.pop();
            }
            ans[i] = i - ( st.size() == 0 ? - 1: st.peek());
            //to not include the element
            st.push(i);   
        }
        return ans;
}  
}