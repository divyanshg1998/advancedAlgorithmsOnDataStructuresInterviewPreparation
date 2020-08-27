import java.util.*;
public class DminStack {

   public static class MinStack {
        //static class made, its a keyword,
        //  must for any object in main to be made
        Stack<Long> st = new Stack<>();
        long min;
        MinStack(){
            min = Integer.MAX_VALUE;
        }
        //cant use static here for functions
        public int top(){
            if( st.peek() < min){
                return (int)(min);
            }
            else{
                long a = (st.peek());
                return (int)(a);
                // return (int)(st.peek());
                //this will give error in java

            }}
        public void push(int ele){
            if( st.size() == 0){
                st.push((long)ele);
                min = ele;
            }
            else if( ele < min){
                long newEle = ele - ( min - ele);//to prevent overFlow
                //test case -inf -( inf - inf) = 3* inf          
                //encoded value can go beyond int                      
                min = ele;
                st.push(newEle);
                System.out.println("h "+ min);
            }
            else{
                st.push((long)ele);
            }
        }
        public int getMin(){
            return (int)(min);
        }
        public int pop(){
            if( st.size() == 1){
                min = Integer.MAX_VALUE;
                // return (int)st.pop();
                // error in java
                long a = st.pop();
                return (int)(a);
            }
            else if( st.peek() < min){
                long prevMin = min - st.pop() + min; //overflow
                // int prevMin = 2 * min - ( st.pop());
                // prevMin = 2 * nowVal - ( nowVal - ( prevMin - nowVal));
                long nowEle = min;
                min = prevMin;
                return (int)(nowEle);               
            }
            else{
                // return (int)(st.pop());
                // error
                long a = st.pop();
                return (int)(a);
            }
        }
        
    }
    public static void main(String[] args){
        int aa = -2147483648;
        System.out.println(aa+"--------");

        //tip: when using a element as long , always keep every 
        // element in the program as long, else does not work

        //special test case
        //push[2147483647],push[-2147483648],top(),pop(),top()
        MinStack m1 = new MinStack();
        m1.push(2147483647);
        System.out.println(m1.top());   
        // System.out.println(m1.top());   
        m1.push(-2147483648);
        System.out.println(m1.getMin());
        System.out.println(m1.top());
        m1.pop();
        System.out.println(m1.top());


        MinStack minStack = new MinStack();
        minStack.push(-2);
        System.out.println(minStack.top());   
        minStack.push(0);
        System.out.println(minStack.top());   
        minStack.push(-3);
        System.out.println(minStack.top());   
        System.out.println(minStack.getMin()); // return -3
        System.out.println(minStack.top());   
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2} 
        minStack.pop();
        System.out.println(minStack.top());   
        

       
}} 