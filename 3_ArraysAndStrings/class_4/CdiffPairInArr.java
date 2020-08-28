import java.util.*;
public class CdiffPairInArr {
    public static void main(String[] args){
        int[] arr = {3, 1, 4, 1, 5};
        // int[] arr ={1,3,1,5,4};//k = 0 
        System.out.println(f(arr,2));
        
        //priorityQueue keeps different elements distinct
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(1);
        pq.add(2);
        pq.add(2);
        while( pq.size() != 0){
            System.out.println(pq.remove());
        }

    }   
    static int f( int[] arr, int k){
        Arrays.sort(arr);

       int i = 0 , j = 0 , count = 0; 
       while ( !(i == arr.length || j == arr.length)) 
        {
            if( arr[j] - arr[i] < k){
                j++;
            }
            else if( arr[j] - arr[i] > k){
                i++;
            }
            else{//equal
                i++;
                j++;
                count++;       
            }

        }
 
        return count;
    }
}