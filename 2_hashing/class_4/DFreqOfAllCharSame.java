import java.util.*;
public class DFreqOfAllCharSame {
    public static void main(String[] args){
        System.out.println(f("xxyyzz"));
    }
 public static boolean f( String str){

    HashMap<Character, Integer> hm = new HashMap<>();
    for(int i = 0 ; i < str.length(); i++){
        hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i),0) + 1);
    }

    HashMap<Integer,Integer> hm2 = new HashMap<>();
    for( int ele : hm.values()){
        hm2.put( ele, hm2.getOrDefault(ele,0) + 1);
    }
    if( hm2.size() == 0 || hm2.size() == 1)    return true; 
    else if( hm2.size() > 2)     return false;
    else{
        //syntax
        ArrayList<Integer> al = new ArrayList<>(hm2.keySet());
        if( Math.abs( al.get(0) - al.get(1)) == 1 && 
        ( hm2.get(al.get(0)) == 1 || hm2.get(al.get(1)) == 1) )     return true;
        else if( (al.get(0) == 1 && hm2.get(al.get(0)) == 1) || 
        (al.get(0) == 1 && hm2.get(al.get(0)) == 1) )    return true;
        else    return false;
    }
}
}