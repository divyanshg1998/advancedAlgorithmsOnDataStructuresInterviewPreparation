import java.util.*;
public class CSubStringWithEqual01 {
    public static void main(String[] args){
    int[] arr = {1, 0, 0, 1, 0, 1, 1};

    System.out.println(f(arr));
    }

    public static int f( int[] arr){

        //
        int[] c0 = new int[arr.length];
        int[] c1 = new int[arr.length];

        for( int i = 0 ; i < arr.length; i++){
            if( i == 0){
                if( arr[0] == 0)    c0[0] = 1;
                else    c1[0] = 1;
            }
            else{
                if( arr[i] == 0){
                    c0[i] = c0[i-1] + 1;
                    c1[i] = c1[i-1];
                }
                else {
                       c1[i] = c1[i-1] + 1;
                       c0[i] = c0[i-1];
                    }
        }
    }
    
        for( int ele : c0){
            System.out.print(ele + " " );
        }
        System.out.println();
        
        
        for( int ele : c1){
            System.out.print(ele + " " );
        }
        System.out.println();
        

        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        hm.put(0, 1);

        for( int i = 0 ; i < c0.length; i++){
            if( hm.containsKey(c0[i] - c1[i]) ){
                ans += hm.get(c0[i] - c1[i]);
                System.out.println( i + " " + c0[i] +" " +c1[i] + "\t" + "ans" + ans);
                hm.put( c0[i] - c1[i], hm.get(c0[i] - c1[i]) + 1);
            }
            else{
                hm.put(c0[i] - c1[i] , 1);
            }            
        }
        
        return ans;
    }

}
