import java.util.*;
public class GgridIllumination {
    public static void main(String[] args){
        int n = 6;
        int [][] lamps = {{1,3}, {2,4}, {5,4}}
        ;int[][] C = {{2,4}, {1,2}};// q = {{1,1},{1,0}};
        int[] arr = f(n, lamps, C);
        System.out.print("[");
        for( int ele : arr)
        System.out.print(ele+",");
        System.out.println("]");
    }
    public static int[] f( int N, int[][] arr, int[][] q){

        //while copying same line i need to be super alert bcz i miss the small change
        //that i have to do and soln becomes wrong, just like forgetting to
        //  change the function name
        HashMap<Integer, Integer> r = new HashMap<>();
        HashMap<Integer, Integer> c = new HashMap<>();
        HashMap<Integer, Integer> d1 = new HashMap<>();
        HashMap<Integer, Integer> d2 = new HashMap<>();
        HashSet<String> points = new HashSet<>();

        for( int i = 0 ; i < arr.length; i++){
            r.put(arr[i][0], r.getOrDefault(arr[i][0],0) + 1);
            c.put(arr[i][1], r.getOrDefault(arr[i][1],0) + 1);
            d1.put(arr[i][0] + arr[i][1], 
            d1.getOrDefault(arr[i][0] + arr[i][1],0) + 1);
            d2.put(arr[i][0] - arr[i][1], 
            d2.getOrDefault(arr[i][0] - arr[i][1],0) + 1);
            //hashset() add
            points.add(arr[i][0] + "*" + arr[i][1]);
        }

        int[] arr3 = new int[q.length];
        for( int i = 0 ; i < q.length; i++){
            if( r.getOrDefault(q[i][0],0) > 0  || c.getOrDefault(q[i][1],0) > 0 
            || d1.getOrDefault(q[i][0] + q[i][1],0) > 0 ||
             d2.getOrDefault(q[i][0] - q[i][1],0) > 0)
                arr3[i] = 1;
            //cant use containsKey here


            int[][] arr2 = {{1,0},{1,1},{0,1},{-1,0},{-1,-1},{0,-1},
            {1,-1},{-1,1},{0,0}};//3 more cases, 8 cases
            for( int j = 0; j < arr2.length; j++){
                int nr = q[i][0] + arr2[j][0];
                int nc = q[i][1] + arr2[j][1];
                if( points.contains( nr + "*" + nc) )
                {
                    r.put(nr, r.getOrDefault(nr,0) - 1);
                    c.put(nc, r.getOrDefault(nc,0) - 1);
                    d1.put(nr + nc, 
                    d1.getOrDefault(nr + nc,0) - 1);
                    d2.put(nr - nc, 
                    d2.getOrDefault(nr - nc,0) - 1);
                    points.remove("" + nr + "*" + nc);
                }
            }
        }
        return arr3;
    }}
