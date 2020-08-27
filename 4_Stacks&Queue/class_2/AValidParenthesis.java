import java.util.*;
public class AValidParenthesis {
    public static void main(String[] args){
        // String str = "[(])";
        String str = "()[]{}";
        System.out.println(f(str));
    }   

static boolean f( String str){

Stack<Integer> st = new Stack<>();
for( int i = 0 ; i < str.length(); i++){
    char ch = str.charAt(i);
    if(ch == '(' || ch == '[' || ch == '{'){
        st.push(i);
    }   
    else{
        //any closing bracket
            if( st.size() == 0)     return false;
            else if( ch == ')' &&  str.charAt(st.peek()) != '(')      
                return false;
    
            else if( ch == '}' &&  str.charAt(st.peek()) != '{')    
                 return false;
    
            else if( ch == ']' && str.charAt(st.peek()) != '[')      
                return false;
    
            else{
                st.pop();
            }
        }
        }
        return st.size() == 0;
    }}