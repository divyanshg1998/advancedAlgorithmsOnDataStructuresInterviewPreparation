import java.util.*;
public class BSuperUglyNo {

    public static class Node implements Comparable<Node>{

        int  value;
        int itsPointer;
       
        Node( int  value, int itsPointer){
            this.value = value;
            this.itsPointer = itsPointer;
        }
        
        @Override
        public int compareTo( Node other){
            return this.value - other.value;
        }
    }

    public static void main(String[] args){
   
   
           // int[] arr = fun(12);
   
           // for( int ele : arr){
           //     System.out.print(ele+ " ");
           // }

           int n = 12; 
           int[] myarr = {2,7,13,19};
   
           System.out.println(fun(n, myarr));

       }
   
       static int fun( int max_, int[] myarr){
                                               
            int [] arr = new int [max_];      
           //if max_ = 3 then array of size 3 
           //but index till 3 - 1

           arr[0] = 1;
           PriorityQueue<Node> pq = new PriorityQueue<>();
           int[] pointer = new int[myarr.length];
           //  int[] pointer = {0, 0, 0};
                      
            for( int i = 0 ; i < myarr.length; i++){
            pq.add(new Node(myarr[i] , i));
            }
            // System.out.println(pq.peek().value);
           
           int count = 1;
           while( count <= max_ - 1){          //because array size
             
               Node nn = pq.remove();
               // System.out.println("1 "+ nn.value);
    
               //we will put value and then put in pq
               //bcz case of inserting 2 in pq 
               arr[count] = nn.value;
               count++;     
    
               pq.add( new Node( myarr[nn.itsPointer] * arr[++pointer[nn.itsPointer]] , nn.itsPointer));
                           
               // System.out.println("2 "+ pq.peek().value);
               while( pq.peek().value == nn.value && count <= max_ - 1){
   
                   Node nn1 = pq.remove();
    
                   // arr[count] = nn1.value;
                   // count++;         
                   //we dont do above here
                   //we dont put same in 
                   
                pq.add( new Node( myarr[nn1.itsPointer] * arr[++pointer[nn1.itsPointer]] , nn1.itsPointer));
                  
               }
           }
           
           for( int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
           }System.out.println();

           return arr[max_-1];
       }
       
   }