import java.util.*;
class EnextGreaterCircularQueue{
    public static void main(String[] args){
        int[] arr = {11, 9, 13, 21, 3, 20};    
        f(arr);        
    }

    public static void f( int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for( int i = 1; i < 2*arr.length ; i++){
            int num = arr[i%arr.length];//get the element
            while( st.size() != 0 && arr[st.peek()] < num){
                ans[st.pop()] = num;                
            }
            if( i < arr.length)
            st.push(i);
        }        
        while( st.size() != 0){
            ans[st.pop()] = -1;
        }
        for( int ele : ans){
            System.out.print(ele + " ");
        }
    } 
}