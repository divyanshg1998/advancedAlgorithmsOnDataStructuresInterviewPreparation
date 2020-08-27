
public class CKelementNoAdjacent {

    public static void main(String[] args){
    //KelementNoAdjacent
        int[] arr ={4, 3, 1, 2, 5, 4, 5};
        System.out.println(fun(arr, 3));
}

public static int fun(int[] arr, int kk){

    // int[][] inc2D = new int[kk + 1][ arr.length + 1];
    // int[][] exc2D = new int[kk + 1][ arr.length + 1];


    int[] inc = new int[arr.length + 1];
    int[] exc = new int[arr.length + 1];

    for( int k = 1 ; k <= kk; k++){
        for( int j = 1 ; j < inc.length; j++){
            if( k == 1){
                inc [j] = arr[j-1]; 
                exc[j] = Math.max( inc[j-1], exc[j-1]);
            }
            else {
                inc[j] = arr[j-1] + exc[j-1];
                exc[j] = Math.max( inc[j-1], exc[j-1]);
            }
       }

     //    System.out.println("inc "+  k);  
    //    for( int i = 0 ; i < inc.length; i++){
    //     System.out.print( inc[i] + " ")
    // ;   }
    //    System.out.println(); 

    //    System.out.println("exc "+ k);  
    //   for( int i = 0 ; i < exc.length; i++){
    //     System.out.print( exc[i] + " ")
    //  ;  }
    //    System.out.println();
    //   }

      return Math.max( inc[inc.length - 1], exc[ exc.length - 1]);

}
}

