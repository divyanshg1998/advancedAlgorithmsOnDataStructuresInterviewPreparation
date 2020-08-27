import java.util.*;
public class EanagramPalindrome1 {
public static void main(String[] args){
System.out.println(f("geeksogeeks"));
System.out.println(f("geeksforgeeks"));
}

public static boolean f( String s){
    //can do by hashmap as well or hashset
    // HashMap<Character, Integer> hm = new HashMap<>();
    // for( char ch : s.toCharArray()){
    //     hm.put(ch, hm.getOrDefault(ch, 0) + 1);
    // } 
    // int odd = 0;

        HashSet<Character> hs = new HashSet<>();
        for( char ch : s.toCharArray()){
            if(hs.contains(ch))
                hs.remove(ch);
            else        
            hs.add(ch);
            }
        return hs.size() <= 1 ;
}
}