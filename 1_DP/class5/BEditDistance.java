
public class BEditDistance {
    public static void main(String[] args){

        // System.out.println(f("sunday", "saturday"));
        System.out.println(f("sunday", "sgrunta"));
        
        // Dont try to be a coder, rather just do what you are told to
        // and you will be one.
        // like you trying better approaches, wastes all the time,
        //though you have none

        // System.out.println(f2("sunday", "sgrunta"));
        
        
    }

    public static int f( String s1, String s2){

        int[][] dp = new int[s2.length() + 1][s1.length() + 1];
    
        for ( int i = 0 ; i < dp.length; i++){
            for( int j = 0 ; j < dp[0].length ; j++){
                if( i == 0){
                    dp[i][j] = j;
                }
                else if( j == 0){
                    dp[i][j] = i;
                }
                else{
                    if( s2.charAt(i-1) == s1.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1];
                    }
                    else{
                        dp[i][j] = Math.min( dp[i-1][j] , Math.min(dp[i][j-1] , dp[i-1][j-1])) + 1;
                    }
                }
            }
        }
        
        for( int i = 0  ; i < dp.length; i ++){
            for( int j = 0 ; j < dp[0].length; j++)
            {
                System.out.print(dp[i][j] + " ");}
            System.out.println();
        }
        
        // CAN CONVERT ANY 2D INTO 1D HERE
        // FOR LESS MEMORY USAGE

        return dp[dp.length - 1][dp[0].length -1];

    }

    
    // public static int f2( String s1, String s2){

    //     int[] dp = new int[s1.length() + 1];
    //     int prev = s1.length(), newEle = 0;

    //     for ( int i = 0 ; i < s2.length(); i++){
    //         for( int j = 0 ; j < dp.length ; j++){
                
    //             if( i == 0){
    //                 dp[j] = j;
    //             }

    //             else if( j == 0){
    //                 newEle = i;
    //                 // dp[j] = i;
    //             }
                
    //             else{
    //                 if( s2.charAt(i-1) == s1.charAt(j-1)){
    //                     newEle = dp[j-1];  
    //                     // dp[i][j] = dp[i-1][j-1];
    //                 }
    //                 else{
    //                     newEle = Math.min( dp[j] ,        Math.min(prev ,  dp[j-1]))    + 1;
    //                     // dp[i][j] = Math.min( dp[i-1][j] , Math.min(dp[i][j-1] , dp[i-1][j-1])) + 1;
    //                 }
    //             }
     
    //             if( i == 0){

    //             }
    //             else if( j != 0){
    //                 dp[j-1] = prev;
    //                 prev = newEle;
    //             }
    //             else if( j == 0 )
    //             {
    //                 dp[dp.length - 1] = prev;
    //                 prev = newEle;
    //             }
    //     }
        
        
    //     for( int ii = 0  ; ii < dp.length; ii ++)
    //    {
    //        System.out.print(dp[ii] + " ");
    //    }System.out.println();
    //         // for( int j = 0 ; j < dp[0].length; j++)
    //     //     {
    //     //         System.out.print(dp[i][j] + " ");}
    //     //     System.out.println();
    //     // }
        
    //     // CAN CONVERT ANY 2D INTO 1D HERE
    //     // FOR LESS MEMORY USAGE
    // }

    return dp[dp.length - 1] ;

}
}