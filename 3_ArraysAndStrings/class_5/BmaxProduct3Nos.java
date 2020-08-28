public class BmaxProduct3Nos {
    public static void main(String[] args){
        int[] arr = {-4,-8, 1,2,3,4};
        System.out.println(f(arr));       
    }
    
    public static int f( int[] arr){
      int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, 
      max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, 
      min2 = Integer.MAX_VALUE;
      for( int i = 0 ; i < arr.length; i++){
          if( arr[i] < min1){
              min2 = min1;
              min1 = arr[i];
          }
          else if( arr[i] < min2){
              min2 = arr[i];
          }
 
          if( arr[i] > max1){
            max3 = max2;
            max2 = max1;
            max1 = arr[i];
          }else if( arr[i] > max2){
              max3 = max2;
              max2 = arr[i];
          }else if( arr[i] > max3) {
              max3 = arr[i];
          }
 
        }
    return Math.max( max1* max2* max3, min1* min2 * max1);    
    }

}