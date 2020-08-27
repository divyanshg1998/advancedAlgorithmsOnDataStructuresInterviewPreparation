import java.util.*;
public class FRabbitInForest {
    public static void main(String[] args){
        int[] arr =  {2, 2 ,3, 3, 3,3, 3, 4};
        System.out.println(f(arr));
    }

    public static int f( int[] arr){        
    
        HashMap<Integer, Integer> hm = new HashMap<>();
        for( int i = 0 ; i < arr.length; i++){
            hm.put( arr[i] + 1 , hm.containsKey(arr[i] + 1) ? hm.get( arr[i] + 1) + 1 : 1); 
        }

       int ans = 0;

        //to put in al
           ArrayList<Integer> al = new ArrayList<>(hm.keySet());
        for( int key : al){      //for loop does not works on arrayList
        System.out.println(key);
        }

        for( Integer key : hm.keySet()){    
             Integer val = hm.get(key);
 
        if( val % key == 0){
            ans += (val/key) * key; 
        }

        else{
            ans += (val/key + 1)* key;
        }
    }

    return ans;
    }
}
//OUTPUT 
//5