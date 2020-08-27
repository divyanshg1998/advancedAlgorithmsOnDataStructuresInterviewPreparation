import java.util.*;
public class BlongestValidParenthesis {
    public static void main(String[] args){
        String str = ")()())";
        System.out.println(f(str));
    }    

    static int f( String str){

    Stack<Integer> st = new Stack<>();
    int omax = 0 ;

    for( int i = 0 ; i < str.length(); i++){
        char ch = str.charAt(i);
        if( ch == '('){
            st.push(i);
        }
        else{
            if( st.size() != 0 && str.charAt(st.peek()) == '('){
                st.pop();
                int cval = i - (st.size() == 0 ? -1 :st.peek());    
                //exclude 1
                omax = Math.max(omax, cval);
            }
            else{
                st.push(i);
            }  
        }
    }
    return omax;
}
}