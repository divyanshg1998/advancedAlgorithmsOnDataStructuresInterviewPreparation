import java.util.*;
public class CnextSmallerOnRight {
    public static void main(String[] args){
        int[] arr = {11, 9, 13, 1, 21, 3, 20};
        f(arr);
    }
    static void f( int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for( int i = 0 ; i < arr.length ; i++){
            int num = arr[i];
            while( st.size() != 0 && num < arr[st.peek()]){
                ans[st.pop()] = num;
            }
            st.push(i);
        }
        while( st.size() != 0){
            ans[st.pop()] = -1;
        }
        for( int ele: ans){
            System.out.print(ele+ " ");
        }  System.out.println();
}
}