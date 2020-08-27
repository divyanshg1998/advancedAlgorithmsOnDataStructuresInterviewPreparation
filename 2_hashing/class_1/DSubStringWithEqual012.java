import java.util.*;

public class DSubStringWithEqual012 {

    public static void main(String[] args){
        // System.out.println(f("0102010"));
        System.out.println(f("102100211"));
  
    }

    public static int f( String s){

         int[] c0 = new int[s.length()];
         int[] c1 = new int[s.length()];
         int[] c2 = new int[s.length()];

        for( int i = 0 ; i < s.length(); i++){
            if( i == 0){
            
                if( s.charAt(i) == '0')    c0[0] = 1;
                else if( s.charAt(i) == '1')    c1[0] = 1;
                else    c2[0] = 1;
            }
            
            else{
                if( s.charAt(i) == '0'){
                    c0[i] = c0[i-1] + 1;
                    c1[i] = c1[i-1];
                    c2[i] = c2[i-1];
                }
                else if( s.charAt(i) == '1'){
                       c1[i] = c1[i-1] + 1;
                       c0[i] = c0[i-1];
                       c2[i] = c2[i-1];

                    }
                else{
                       c2[i] = c2[i-1] + 1;
                       c0[i] = c0[i-1];
                       c1[i] = c1[i-1];

                }
        }
    }
        for( int ele : c0){
            System.out.print(ele + " " );
        } 
        System.out.println();
       
         for( int ele : c1){
            System.out.print(ele + " " );
        }
        System.out.println();
        
        for( int ele : c2){
            System.out.print(ele + " " );
        }
        System.out.println();

        HashMap<String, Integer> hm = new HashMap<>();
        int ans = 0;
        hm.put("0*0", 1);

        for( int i = 0 ; i < c0.length; i++){
            String s1 = (char)(c0[i] - c1[i] + '0') + "*" + (char)(c0[i] - c2[i] + '0');
            //to convert char to string , use "*" not '*'
            // System.out.println(s1);

            if( hm.containsKey(s1) ){
                ans += hm.get(s1);
                System.out.println( i + " " + c0[i] +" " +c1[i] + " " +c2[i]  + "\t" + "ans" + ans);
                hm.put(s1, hm.get(s1) + 1);
            }
            else{
                hm.put(s1 , 1);
            }            
        }
        
        return ans;
    }

}
