public class BmaxProductOfASubArray {
    public static void main(String[] args){
        int[] arr = {2,3,-2,4};
        System.out.println(f(arr));
    }   

    static int f( int[] arr){

    int omax = Integer.MIN_VALUE;
    
    int prefixProd = 1;
    for( int ele: arr){
        if( ele == 0){
            omax = Math.max( 0, omax);
            prefixProd = 1;
            continue; 
            //case 0 handle
        }
        prefixProd *= ele;
        omax = Math.max(omax, prefixProd);
    }

    int suffixProd = 1;
    for( int i = arr.length - 1; i >= 0 ;i--){
        if( arr[i] == 0){
            omax = Math.max( 0, omax);
            suffixProd = 1;
            continue; 
            //case 1 handle
        }
        suffixProd *= arr[i];
        omax = Math.max(omax, suffixProd);
    }
    
    return omax;
       }

}