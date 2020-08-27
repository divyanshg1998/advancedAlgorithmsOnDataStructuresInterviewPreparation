import java.util.*;
class EtrappingRainwaterq2 {
    static class c implements Comparable<c>{  
        int x;
           int y;
           int val;
           c(){};
           c(int xx, int yy, int vall){
               x= xx;  
               y=yy;
               val = vall;
           }
           @Override
           public int compareTo( c o){
               return this.val - o.val;
           }
       }
       
    public static int f( int[][] arr){
       
        //  TRY TO CODE YOURSELF, VERY IMP AND TOUGH QUES
        //dont write m and n as arr.length or arr[0].length
        //its O(1) itself for length in any language, except for 
        //strings in c , where we use'\0' to end the string
        int m = arr.length; 
        int n = arr[0].length;
              
        if( m == 1 || n == 1)   return 0;
        boolean[][] tru = new boolean[m][n];
        int ans = 0;
        PriorityQueue<c> pq = new PriorityQueue<>();
        //not good fpr time
        // PriorityQueue<c> pq = new PriorityQueue<>
        // ((n1,n2) -> n1.val - n2.val);
        
        for( int i = 0 ; i < m; i++){
            pq.add(new c(i,0,arr[i][0]));
            pq.add(new c(i,n-1,arr[i][n-1]));//will get handled
            tru[i][0] = true;
            tru[i][n-1] = true;
        }
        for( int i = 1 ; i < n-1; i++){
            // n-1 here,silly mistake
            pq.add(new c(0,i,arr[0][i]));
            pq.add(new c(m-1,i,arr[m-1][i]));//will get handled
            tru[0][i] = true;
            tru[m-1][i] = true;
        }
        for( boolean[] tru1: tru){
            for( boolean tru3 : tru1){
                System.out.print(tru3+"\t");
            } System.out.println();
        }
        
        int num2 = 0;
        for( c ele: pq){
            System.out.println(++num2 + ". " +  ele.val+" "+ele.x + " " + ele.y );
            // not in order here
        }
        //dont use iterator           
        // Iterator g_iterator = pq.iterator(); 
        // System.out.print("Iterator values : "); 
        // while(g_iterator.hasNext()) 
        int num = m*2 + n*2 - 4;
        int[][] arr2 = {{1,0},{0,1},{0,-1},{-1,0}};
        //write above in order,or silly mistake
        while( num < m*n){
            c myVal = pq.remove();
            System.out.println((num+1) + ". " + myVal.x + " " + myVal.y 
                                                + " " + myVal.val);
            for( int i = 0 ; i < arr2.length; i++){
                int nr = myVal.x + arr2[i][0];
                int nc = myVal.y + arr2[i][1];
                if( nr >= 0 && nr < arr.length && nc >=0 && nc < arr[0].length
                  && !tru[nr][nc])
                  {
                    tru[nr][nc] = true;
                    num++;
                    //not below, rather
                    // if( arr[nr][nc] < arr[myVal.x][myVal.y])    
                    if( arr[nr][nc] < myVal.val)    
                    {
                        // ans += arr[myVal.x][myVal.y] - arr[nr][nc];
                        ans += myVal.val - arr[nr][nc];
                        // pq.add(new c( nr, nc, arr[myVal.x][myVal.y]));                        
                        pq.add(new c( nr, nc, myVal.val));                        
                        System.out.println(num + ". " + nr + " " + nc 
                                      + " " + arr[nr][nc]+ " now ans=" + ans);
                    }    
                    else{
                    pq.add(new c(nr,nc, arr[nr][nc]));
                    System.out.println(num + ". " + nr + " " + nc 
                                        + " " + arr[nr][nc]+"ansNoChange");
            
                }      }         }    }        
        return ans;   }
    public static void main(String[] args){
        
        //  TRY TO CODE YOURSELF, VERY imp AND TOUGH ques 
        int[][] arr = 
        {{12,13,1,12},
        {13,4,13,12},
        {13,8,10,12},
        {12,13,12,12},
        {13,13,13,13}}
        ;
        System.out.println(f(arr));
    }}//output
//     true	true	true	true	
// true	false	false	true	
// true	false	false	true	
// true	false	false	true	
// true	true	true	true	
// 1. 1 0 2
// 2. 12 0 3
// 3. 12 0 0
// 4. 12 1 3
// 5. 13 2 0
// 6. 12 2 3
// 7. 12 3 0
// 8. 12 3 3
// 9. 13 4 0
// 10. 13 4 3
// 11. 13 0 1
// 12. 13 4 1
// 13. 13 1 0
// 14. 13 4 2
// 15. 0 2 1
// 15. 1 2 13ansNoChange
// 16. 0 3 12
// 16. 1 3 12
// 16. 3 3 12
// 16. 3 2 12ansNoChange
// 17. 0 0 12
// 17. 2 3 12
// 17. 2 2 10 now ans=2
// 18. 3 2 12
// 18. 3 1 13ansNoChange
// 19. 2 2 12
// 19. 2 1 8 now ans=6
// 20. 3 0 12
// 20. 2 1 12
// 20. 1 1 4 now ans=14
// 14
   
