import java.util.*;
public class CpascalsTriangle {
    public static void main(String[] args){
        List<Integer> ll = f(4);        
        
    }   
    static List<Integer> f( int k){
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);  
        if( k == 0)     return l;
       
        l.add(1);
        if( k == 1)     return l;
        
        for( int i = 2 ; i <= k ; i++){
            for( int j = l.size() - 1 ; j > 0 ; j--){
                l.set(j, l.get(j) + l.get(j-1));
            }l.add(1);
            for( Integer ll : l){
                System.out.print(ll+ " ");
            }System.out.println();
        }      
        return l;
    }
}