
public class C4KeyKeyBoard {

    public static void main(String[] args){

        System.out.println(f(12));
    }

    public static int f( int n){

        int[] dp = new int[n+1];
    
        for( int i = 0 ; i < dp.length; i++){
            if( i < 6)  dp[i] = i;
            else{
                dp[i] = Math.max(dp[i-3]*2, Math.max( 
                    dp[i-4]*3, Math.max( dp[i-5] *4, dp[i-6] * 5)));
            }
        }

        for( int i = 0 ; i < dp.length; i++){ 
            System.out.println(i+" "+ dp[i]);
        }

        return dp[n];
    }

}