public class EMajorityElements {
    public static void main(String[] args){
    int[] arr = {2,2,1,1,1,2,2};
    System.out.println(majorityElement(arr));    
}

public static int majorityElement(int[] arr) {
    int val = arr[0];
int count = 1;
for( int i = 1; i < arr.length; i++){
    if(  val == arr[i] ){
         count++;               
    }
    else{
        if( count == 0){
            val = arr[i];
            count++;
        }
        else{
            count--;
        }
    }
} 
return val;


}}