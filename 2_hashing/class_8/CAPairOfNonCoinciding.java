import java.util.*;
public class CAPairOfNonCoinciding{
    public static void main(String[] args){
        int[][] arr = {{1, 2}, {2, 3}, {1, 3}};
        System.out.println(f(arr));
    }
    public static int f( int[][] arr){

        HashMap<Integer,Integer> x = new HashMap<>();
        HashMap<Integer,Integer> y = new HashMap<>();
        HashMap<String,Integer> xy = new HashMap<>();
        int ans = 0;
        for( int i = 0 ; i < arr.length; i++){
           //try to avoid using
           ans+=x.getOrDefault(arr[i][0],0) +
           y.getOrDefault(arr[i][1],0);
            x.put(arr[i][0], x.getOrDefault(arr[i][0],0) + 1);
            y.put(arr[i][1], y.getOrDefault(arr[i][1],0)+ 1);
            //returns previous value or null
            //put works as a get too            
            String str = arr[i][0]+"*"+arr[i][1];
           //always store the element to be processed in for loop
            if(xy.containsKey(str)){
                ans -= 2* ( xy.put(str, xy.getOrDefault(str,0) + 1));
            }
            else
            xy.put(str,1);
        }
        return ans;

    }
}
