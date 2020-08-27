import java.util.*;
public class FKAnagrams {
    public static void main(String[] args){
        System.out.println(f("geeks","egekf",1));
    }
    public static boolean f(String str1, String str2, int k){

        if( str1.length() != str2.length())     return false;
        HashMap<Character,Integer> hm = new HashMap<>();
        for( char ch : str1.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int nm = 0 ;//not match
        for( char ch : str2.toCharArray()){
            if(hm.getOrDefault(ch,0) > 0){
               hm.put(ch, hm.get(ch) - 1);
            }
            else
            nm++;
        }
        return nm <= k;

    }
}