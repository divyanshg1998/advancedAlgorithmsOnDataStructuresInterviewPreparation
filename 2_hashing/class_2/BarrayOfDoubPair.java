
import java.util.*;

public class BarrayOfDoubPair {
    public static void main(String[] args){

        int[] arr = { -2, -4, -2, -4};
        System.out.println(f(arr));
    
        // int[] arr2 = new int[100];
        // for( int i = 0 ; i < arr2.length; i++){
        //     arr2[i] = i;
        // }

        // HashSet<Integer> hs = new HashSet<>();
        // for( int ele : arr2){
        //     hs.add(ele);
        // }

        // Iterator<Integer> itr = hs.iterator();
        // int i = 0;
        // while( itr.hasNext() ){
        //     System.out.println(hs.contains(8));    
        //     int ele = itr.next();
        //     System.out.println(ele);
        //     hs.add(-1);
        //     // if(i == 0)  hs.remove(2);
        //     // if(i == 1)  hs.remove(1);
        //     i++;
        //     //  : hs.remove(2);
        // }

    }
     public static boolean f( int[] arr){

        //sorts array
        Arrays.sort(arr);

        for( int ele: arr){
            System.out.println(ele);
        }       

        HashMap<Integer, Integer> hm = new HashMap<>();

        for( int ele : arr){
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        }
        
        for( int i = 0 ; i < arr.length; i++){
            //not contains
            if( hm.getOrDefault(arr[i],0) > 0  )   continue;
            
            else{   
               //contains
               System.out.println("1"+ arr[i]+ " " + arr[i]*2);
               if( arr[i] < 0){
                 if( hm.getOrDefault(arr[i]/2,0) > 0 ){
                    hm.put(arr[i], hm.get(arr[i]) -1);
                    hm.put(arr[i]/2, hm.get(arr[i])-1);
                    }
               else{
                return false;
               }

               if( arr[i] > 0){
                if( hm.getOrDefault(arr[i]*2,0) > 0 ){
                   hm.put(arr[i], hm.get(arr[i]) -1);
                   hm.put(arr[i]*2, hm.get(arr[i])-1);
                   }
              else{
               return false;
              }

            }
        }        
    }

}
    return true;
}
}