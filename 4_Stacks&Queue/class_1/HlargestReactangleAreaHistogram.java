import java.util.*;
public class FlargestReactangleAreaHistogram {
    public static void main(String[] args){
        int[] arr = {2,1,5,6,2,3};
        System.out.println(f(arr));
    }   

    static int f( int[] arr){
        Stack<Integer> st = new Stack<>();
        int oans = 0;
        for( int i = 0 ; i < arr.length; i++){
            int num = arr[i];
            System.out.println(i + ". "+arr[i]);
            while( st.size() != 0 && num < arr[st.peek()]){
                int ele = arr[st.pop()];
                int cans = ele * (i - (st.size() == 0 ? -1 : st.peek()) -1);
                System.out.println(cans);
                oans = Math.max(oans, cans);
            }
            st.push(i);
        }    
        while( st.size() != 0){
            int ele = arr[st.pop()];
            int cans = ele * (arr.length - (st.size() == 0 ? -1 : st.peek()) -1);
            oans = Math.max(oans, cans);
        }
       return oans;        
       }
}