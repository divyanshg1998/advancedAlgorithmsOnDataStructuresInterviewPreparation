import java.util.*;
public class CAssemmblyLine {

    public static void main(String[] args){
        int[] arr ={4 ,3 ,1, 2};
        System.out.println(f(arr));
    }
    public static int f( int[] arr){

        HashMap<Integer, Integer> hm = new HashMap<>();
        int max_ = Integer.MIN_VALUE;
        for( int ele: arr){
            hm.put( ele, hm.getOrDefault(ele -1, 0) + 1);
            max_ = Math.max( max_,hm.getOrDefault(ele - 1, 0) + 1);
        }        

        return arr.length - max_;

    }
}