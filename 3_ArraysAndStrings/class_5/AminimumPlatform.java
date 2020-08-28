import java.util.*;
public class AminimumPlatform {
    public static void main(String[] args){
        
        int[] a = {900,  940, 950,  1100, 1500, 1800};
        int[] b = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(f(a,b));

    }
    
    static int f( int[] a, int[] d){
    Arrays.sort(a);Arrays.sort(d);
        int i = 0 , j = 0, cplat = 0, oplat = 0;
        while( i != a.length && j != d.length) {
            
            if(a[i] <= d[j]){
                // System.out.println("1. " + i + " " + j + " " + a[i] + " " + d[j] + " " + cplat);
                cplat++;
                i++;            
            }else {
                // System.out.println("2. " + i + " " + j + " " + a[i] + " " + d[j] + " " + cplat);
                cplat--;
                j++;
            }
            // System.out.println(cplat+ "  " + oplat);
                oplat = Math.max(oplat, cplat);
        }       
        return oplat;`
        //.special test case
        //when arr[i] == arr[j], we cannot do both i++,j++
        //case start 800 830 830 830
        // case end  830 845
        //note we can increase only i and not j here
        
    }
    
}
    
