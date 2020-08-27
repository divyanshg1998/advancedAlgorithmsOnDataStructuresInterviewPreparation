public class ALcs {
    
    public static void main(String[] args){
        System.out.println(f( "bacf","abfc","zafc"));

    }
    public static int f( String s1, String s2, String s3){
        int[][][] dp = new int[s1.length() + 1][s2.length() + 1][s3.length() + 1];

        for( int i = dp.length - 2 ; i >= 0; i--){
            for ( int j = dp[0].length - 2 ; j >= 0 ; j--){
                for( int k = dp[0][0].length - 2 ; k >= 0; k--){
                    if( s1.charAt(i) == s2.charAt(j) && s2.charAt(j) == s3.charAt(k)){
                        dp[i][j][k] = dp[i+1][j+1][k+1] + 1;
                    } 
                    else{
                        dp[i][j][k] = Math.max( dp[i+1][j][k], Math.max(dp[i][j+1][k] , dp[i][j][k+1]) );
                    }
               }
            }
        }
    
        for( int i = dp.length - 2 ; i >= 0; i--){
           for ( int j = dp[0].length - 2 ; j >= 0 ; j--){
               for( int k = dp[0][0].length - 2 ; k >= 0; k--){
                    System.out.println(i + "," + j + "," + k + " = " + dp[i][j][k]);
                }
            }
        }
 
        return dp[0][0][0];
    }
}