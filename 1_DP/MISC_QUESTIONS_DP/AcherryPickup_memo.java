import java.util.*;
public class cherryPickup_memo{
    
    public static void main(String[] args){

        int[][] a1 = { 
            {  0 ,  1 ,  0 ,  1 ,  0  }, 
            {  1 ,  -1 ,  -1 ,  -1 , 0}, 
            {  1 ,  0 ,  1 ,  0 ,  1  }, 
            {  0 ,  -1 ,  -1 ,  -1 , 1}, 
            {  0 ,  1 ,  0 ,  1 ,  0  } 
        }; 
      
        // int[][] aa = 
        // {{1,0,0,0,0,0,0,0,0},
        // {0,0,0,0,0,1,1,-1,0},
        // {0,0,1,1,0,0,0,-1,1},
        // {0,0,-1,-1,-1,-1,1,-1,0},
        // {0,1,0,-1,1,0,1,-1,0},
        // {0,0,0,-1,1,1,0,0,0},
        // {1,0,0,0,0,0,0,0,0}
    // };

        System.out.println(f( a1));
    }

    public static int f( int[][] arr){

        int[][][][] dp = new int[arr.length][arr[0].length][arr.length][arr[0].length];

        for( int[][][] dp1 : dp){
            for( int[][] dp2 : dp1){
                for( int[] dp3 : dp2){
                    for( int dp4 : dp3){
                        dp4 = -1;
                    }
                }
            }
        }

        return f2(0, 0, 0, 0, arr);    

    }


    static int[][] a={{1,0,1,0}
                    ,{1,0,0,1}
                    ,{0,1,0,1},
                    {0,1,1,0}};
    
    
    public static boolean isValid( int sr1, int sc1, int sr2, int sc2, int[][] arr){
        if(sr1 > arr.length - 1 || sr1 < 0 || sc1 > arr[0].length - 1 || sc1 < 0 || 
           sr2 > arr.length - 1 || sr2 < 0 || sc2 > arr[0].length - 1 || sc2 < 0 ||
           arr[sr1][sc1] == -1 || arr[sr2][sc2] == -1 )
                return false;
                
                return true;
    }

    public static int f2( int sr1, int sc1, int sr2, int sc2, int[][] arr){

        if( sr2 == arr.length - 1 && sc2 == arr[0]. length - 1){
             if( sr1 == arr.length - 1 &&  sc1 == arr[0]. length - 1){
                return arr[sr1][sr2];
            }
         }

        // if( dp[sr1][sc1][sr2][sc2] != -1)   return dp[sr1][sc1][sr2][sc2];       

        int count = 0;
        int num = 0;
       
        num += arr[sr1][sc1];

        if( sr1 != sr2){ 
            num += arr[sr2][sc2];
        }

        for( int i = 0; i < a.length; i++)
        {   
            //maizepath approach
            int nr1 = sr1 + a[i][0];
            int nc1 = sc1 + a[i][1];
            int nr2 = sr1 + a[i][2];
            int nc2 = sc2 + a[i][3];

            if(  isValid(nr1, nc1, nr2, nc2, arr))
               count = Math.max(f2(nr1, nc1, nr2, nc2 , arr), count);
        }

        
        // dp[sr1][sc1][sr2][sc2] = count + num;       

        return count + num;

    }

}

// [
// [1,1,1,1,0,0,0],
// [0,0,0,1,0,0,0],
// [0,0,0,1,0,0,1],
// [1,0,0,1,0,0,0],
// [0,0,0,1,0,0,0],
// [0,0,0,1,0,0,0],
// [0,0,0,1,1,1,1]]