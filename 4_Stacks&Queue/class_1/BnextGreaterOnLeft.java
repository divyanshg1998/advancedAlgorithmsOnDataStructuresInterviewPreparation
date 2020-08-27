import java.util.*;
public class BnextGreaterOnLeft {
    public static void main(String[] args){
        int[] arr =  {11, 9, 13, 21, 20, 3};
        f(arr);
    }    
    public static void f( int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for( int i = arr.length - 1; i >=0 ; i--){
            int num = arr[i]; //
            while( st.size() != 0 && num > arr[st.peek()]){
                ans[st.pop()] = num;
            }
            st.push(i);
        } 
        while( st.size() != 0){
            ans[st.pop()] = -1;
        }

        for( int ele: ans){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}