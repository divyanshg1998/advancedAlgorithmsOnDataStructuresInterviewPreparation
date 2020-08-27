import java.util.*;
public class GLongestConseutiveSubsequence1 {
    public static void main(String[] args){
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(f(arr));
    }    
    static int f ( int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int max = 0;// if empty arr, arr.len = 0
        for( int ele : arr){

            if( hm.containsKey(ele))    continue;//for repetition
           else if( hm.containsKey(ele - 1) && hm.containsKey(ele + 1)){
                int num1 = hm.get(ele - 1);
                int num2 = hm.get(ele + 1);

                int tot = num1 + num2 + 1;
                
                hm.put(ele, tot);//no need to put this
               //but have to put this or else willnot work here, 
               // bcz then if the middle element comes again cant go to continue again
                hm.put( ele - num1 , tot);
                hm.put( ele + num2, tot);
                
                max = Math.max( max, tot);
            }
            else if( hm.containsKey(ele - 1)){
                int num = hm.get(ele - 1);
                hm.put( ele, num + 1);
                hm.put( ele - num, num + 1);

                max = Math.max( max, num + 1);
            }
            else if( hm.containsKey( ele + 1)){
                int num = hm.get( ele + 1);
                hm.put(ele, num + 1);
                hm.put(ele + num, num + 1); 
                
                max = Math.max( max, num + 1);               
            } 
            else{
                hm.put( ele, 1);
                max = Math.max( max, 1);                              
            }
        }

        for (int ele : hm.keySet()){
            System.out.println(ele + " = "+ hm.get(ele));
        }
        return max;          
    }
}