import java.util.*;
public class CIslandPerimeter {
    public static void main(String[] args){
        //1.
        int[][] arr = 
        {{0,1,0,0},
        {1,1,1,0},
        {0,1,0,0},
        {1,1,0,0}};

        System.out.println(fun(arr));
    }
    
    public static int fun(int[][] arr){
        int ans = 0;
        int[][] arr2 = {{1,0},{0,1}};
        for( int i = 0 ; i < arr.length; i++){
            for( int j = 0 ; j < arr[0].length; j++){
                if( arr[i][j] == 1){
                int num = 0;
                for( int k = 0 ; k < arr2.length; k++){
                int nr = i + arr2[k][0];
                int nc = j + arr2[k][1];
                if(nr < arr.length && nc < arr[0].length &&
                 arr[nr][nc] == 1)
                num+=2;
                }
                ans += 4-num;
            }
        }
    }
return ans;
}
}