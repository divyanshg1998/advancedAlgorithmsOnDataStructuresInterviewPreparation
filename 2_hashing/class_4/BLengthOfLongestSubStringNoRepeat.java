import java.util.*;

public class BLengthOfLongestSubStringNoRepeat {
    
    public static void main(String[] args){

        // System.out.println(f("ABDEFGABEF")); 
        System.out.println(f("tmmzuxt")); 
        System.out.println(f("abcabcbb")); 


    }
    public static int f( String str){

            //will not work if string " " also allowed
            //and no constrained given of character
            //NOT SUBMIT ON LEETCODE
            // 
        HashMap<Character, Integer> hm = new HashMap<>();
        int len = 0, st = 0 , end = -1;

        int[] arr = new int[27];
    
        for( int i = 0 ; i < str.length(); i++){
            if(hm.getOrDefault(str.charAt(i),0) > 0 && 
            st <= arr[(int)(str.charAt(i) - 'a')]){
            //  handle if start contains that char          
                st = arr[(int)(str.charAt(i) - 'a')] + 1;
                arr[(int)(s5tr.charAt(i) - 'a')] = i;
            // hm.put(str.charAt(i), hm.get(str.charAt(i)) - 1);
                end++;               
            }
            else{
                hm.put(str.charAt(i),1);
                int num = (int)(str.charAt(i) - 'a');
                // System.out.println(nu4m);
                arr[num] = i;
                end++;
                len = Math.max( len, end - st + 1);
            }
            System.out.println(str.charAt(i) + " " +st + " " + end + " " + len);
        }

        return len;
       }
}