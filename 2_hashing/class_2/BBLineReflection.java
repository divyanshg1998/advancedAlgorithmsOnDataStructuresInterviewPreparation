import java.util.*;
public class BBLineReflection {
    public static void main(String[] args){
        
        int[][] arr = {{1,1},{1,4},{2,4},{2,3},{3,1},{4,4},{4,3},{5,4},{5,1}};
        System.out.println(f(arr));
    }

    public static boolean f( int[][] arr){
        
    HashMap<Integer,HashSet<Integer>> hm = new HashMap<>();
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    for( int[] arr1 : arr){
        max = Math.max(max, arr1[0]);
        min = Math.min(min, arr1[0]);
        HashSet<Integer> set = hm.get(arr1[1]);
        if( set == null){
            set = new HashSet<>();
            hm.put(arr1[1], set);
        }
        set.add(arr1[0]);    
    }
    
    for( int a : hm.keySet()){
        HashSet<Integer> hs = hm.get(a);
        Iterator<Integer> i = hs.iterator();
        System.out.print(a+"=> ");
        while( i.hasNext()){
            System.out.print(i.next() + " ");
        }System.out.println();
    }

    
    int mid = (min + max)/2;
    for( int[] arr1 : arr){
        int x = arr1[0];
        int xNew = 2 * mid - x;
        if( hm.get(arr1[1]).contains(xNew) )
        {}    
        else 
            return false;    
    }
 
    //can run loop diractly on arr ,
    //then to run in hashmap and hashset as long syntax for that
    //and thinking too
    return true;
    }
}