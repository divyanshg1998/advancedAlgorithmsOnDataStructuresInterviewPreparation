import java.util.*;
public class ImaxSizeBinaryMatrixHaving1 {
    // maximum area binary matrix containing 1
    public static void main(String[] args){
        char[][] arr = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
          };
          //return rectangle having 1 , its area
          System.out.println(f(arr));
    }
     static int f( char[][] arr){

        int[] ans = new int[arr[0].length];
        int omax = 0;
        for( int i = 0 ; i < arr.length ; i++){
            for( int j = 0 ; j < arr[0].length; j++){
                ans[j] = arr[i][j] == '0' ? 0 : ans[j] + 1;
            }        
            omax = Math.max(omax, AreaInAHistogram(ans));
        }
        return omax;
    }

    static int AreaInAHistogram(int[] arr){
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