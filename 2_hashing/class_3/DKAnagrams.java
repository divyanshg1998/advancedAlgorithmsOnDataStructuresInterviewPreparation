import java.util.*;

public class DKAnagrams {
    public static void main(String[] args){
       
        // List<Integer> l = f("abab","ab");
        List<Integer> l = f("cbaebabacd","abc");
        
        for( int i = 0 ; i < l.size(); i++){
            System.out.print(l.get(i) + " ");
        }System.out.println();

    }

    public static List<Integer> f(String s, String p){

        // ArrayList<Integer> al = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        if( s.length() < p.length() || s.length() == 0
                     || p.length() == 0)   return res;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        // for string traversal str.toCharArray();
        for( char ch : p.toCharArray()){
            hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);
        }
        int mc = 0 ; //mycount
        for( int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            if( hm.get(ch) <= hm2.getOrDefault(ch,0))  mc++;
            if(i>=p.length()){
                char ch1 = s.charAt(i-p.length());
                if(hm.get(ch1) <= hm2.getOrDefault(ch1,0)){
                    mc--;
                }
                hm.put(ch1, hm.get(ch1) - 1);                
            }
            if( mc == p.length())    res.add(i-p.length()+1);
            
        }

        return res;

    }
}