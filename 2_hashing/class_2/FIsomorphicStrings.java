import java.util.*;
public class FIsomorphicStrings{
    public static void main(String[] args){
        //syntax for keySet() al
        ArrayList<Integer> aa = new ArrayList<>(hm4.keySet());
        System.out.println(f("paper","title"));
        System.out.println(f("paper","titli"));   
        System.out.println(Math.pow(10,9));
        
    }

    public static boolean f( String s, String t){
        
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        for( int i = 0 ; i < s.length() ; i++){
            char a = s.charAt(i); //loop mai nikaal loo
            char b = t.charAt(i);
            if( (hm1.containsKey(a) && hm1.get(a) != b) ||
             (hm2.containsKey(b) && hm2.get(b) != a))
            return false;
            
            else
            {
                hm1.put(a,b);
                hm2.put(b,a);
            }
        }
        return true;
    }

}