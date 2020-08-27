import java.util.*;
class AlongPressedName {
    public static void main(String[] args){

        System.out.println(f("saeed","ssaaeedd"));
        
        //special case, when str1 has extra character
        System.out.println(f("pyrz","ppyyr"));
        //special case, first character not match
        System.out.println(f("dfuyalc","fuuyallc"));

    }    
     static boolean f( String str1, String str2){

    int i = 0 , j = 0 ;
    int s1l= str1.length();
    int s2l= str2.length();
    
    for( j = 0 ; j < s2l; j++){
        if( i < s1l && str1.charAt(i) == str2.charAt(j)){
        //char match
        i++;
        }
    //char mismatch
    // else if( i < s1l && str1.charAt(i) != str2.charAt(j)){
    //char mismatch
        else if(j==0 || str2.charAt(j) != str2.charAt(j-1))
            return false;  
    // j == j-1            
        }
    
return i == s1l;
}
}