import java.util.*;

public class AUglyNos {

    public static class Node implements Comparable<Node>{

           int  value;
           int itsPointer;
          
           Node( int  value, int itsPointer){
               this.value = value;
               this.itsPointer = itsPointer;
           }
           
           @Override
           public int compareTo( Node other){
               return (int) (this.value - other.value);
            
            }
   
       }
   
   
       public static void main(String[] args){
   
        int[] arr = fun(12);
   
        for( int ele : arr){
            System.out.print(ele+ " ");
        }
  
        //EXTRA USELESS
        //    Scanner scn = new Scanner(System.in);
        //    int num = scn.nextInt();
   
        //    int[] arr = new int[num];
        //    int max_ = -1;
   
        //    for( int i = 0 ; i < arr.length; i++){
        //        arr[i] = scn.nextInt();
        //        max_ = Math.max(max_ , arr[i]);
        //    }
       
        // int [] arr2 = fun(max_);
   
        //    for( int i = 0 ; i < arr.length; i++){
        //        System.out.println(arr2[arr[i] - 1]);
        //    }
   
   
      
       }
   
       static int [] fun( int max_){
                                               
        int  [] arr = new int [max_];      
           //if max_ = 3 then array of size 3 
           //but index till 3 - 1
           arr[0] = 1;
           PriorityQueue<Node> pq = new PriorityQueue<>(  );
           int[] pointer = {0, 0, 0};
           
           pq.add(new Node(2, 0));
           pq.add(new Node(3, 1));
           pq.add(new Node(5,2));
           
           // System.out.println(pq.peek().value);
           
           int count = 1;
           while( count <= max_ - 1){          //because array size
             
               Node nn = pq.remove();
               // System.out.println("1 "+ nn.value);
    
               arr[count] = nn.value;
               count++;     
    
               if( nn.itsPointer == 0) {
                   pq.add( new Node( 2 * arr[++pointer[nn.itsPointer]] , 0));
               }
               else if( nn.itsPointer == 1){
                   pq.add( new Node( 3 * arr[++pointer[nn.itsPointer]] , 1));
               }
               else{
                   pq.add( new Node( 5 * arr[++pointer[nn.itsPointer]] , 2));
               }   
           
               
               // System.out.println("2 "+ pq.peek().value);
               while( pq.peek().value == nn.value && count <= max_ - 1){
   
                   Node nn1 = pq.remove();
    
                   // arr[count] = nn1.value;
                   // count++;         
                   //we dont do above here
                   //we dont put same in 
                   
                   if( nn1.itsPointer == 0) {
                       pq.add( new Node( 2 * arr[++pointer[nn1.itsPointer]] , 0));
                   }
                   else if( nn1.itsPointer == 1){
                       pq.add( new Node( 3 * arr[++pointer[nn1.itsPointer]] , 1));
                   }
                   else{
                       pq.add( new Node( 5 * arr[++pointer[nn1.itsPointer]] , 2));
                   }   
               }
           }
           
           return arr;
       }
       
   }