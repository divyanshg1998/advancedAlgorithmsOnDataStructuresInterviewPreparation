import java.util.*;

public class ERefullingStations{

    public static void main(String[] args){

        Queue<Integer> pq = new PriorityQueue<>(2);
        pq.add(3);
        pq.add(2);
        pq.add(2);
        pq.add(1);
        
        while( pq.size() > 0){
            System.out.println(pq.remove());
        }
        System.out.println("--");
    
        int[][] arr = {{10,60},{20,30},{30,30},{60,40}};
        System.out.println(f( arr, 100, 10));
        
    }

    public static int f( int[][] arr, int targ, int f){

        //extra handle
        if( arr.length == 0){
            if( targ > f){
                return -1;
            }
             return 0; 
        }  
        
        f = f - arr[0][0]; //fuel
        if(f<0)     return -1;

        int ans = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for( int i = 0 ; i < arr.length - 1; i++){
            pq.add(arr[i][1]);

            while( (arr[i+1][0] - arr[i][0]) > f)
            {
                if( pq.size() == 0)     return -1;
                else{
                    f = f + pq.remove();
                    System.out.println("---------- " + i + " " + f + " " + ans);
                    ans++;
                }
            }
        f = f - (arr[i+1][0] - arr[i][0]);
        System.out.println(i + " " + f);
        }
        pq.add(arr[arr.length-1][1]);
      
        while( (targ - arr[arr.length - 1][0] ) > f)
            {
                if( pq.size() == 0)     return -1;
                else{
                  
                    f = f + pq.remove();
                    System.out.println( f + " " + ans);
                  
                    ans++;
                }
            }

        return ans;

    }
// OUTPUT
// ---------- 0 60 0
// 0 50
// 1 40
// 2 10
// 50 1
// 2
}

