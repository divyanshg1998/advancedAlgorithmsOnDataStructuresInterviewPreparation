import java.util.*;

public class Dwildcard {

    public static void main(String[] args){
    
        // fun("aAAcAb","a*c?b");
        // fun("adceb","*a*b"); //special case * before *
        // System.out.print();
        fun("mississippi","m??*ss*?i*pi");
    
    }
 


    public static void fun( String str1, String str2){

        boolean[][] tru = new boolean[str2.length()][str1.length()];
        
        for( int i = 0; i < tru.length ; i++){
            for( int j = 0; j < tru[0].length; j++){
                
                if( i == 0 && j == 0 && (str2.charAt(i) == str1.charAt(j) || str2.charAt(i) =='?')
                    && str2.charAt(j) != '*')
                    //if equal to '?' case covered
                    tru[0][0] = true;
                
                if( str2.charAt(i) == '*'){
 
                    int val = i;
                    for( int ii = 0 ; ii < i ; ii++){
                        if( str2.charAt(ii) == '*'){
                            val = ii;
                            System.out.println("val"+ val);
                            break;
                        }
                    }

                    for( int jj = 0 ; jj < val ; jj++){
                        //case of * disappearing too covered when jj = i
                        tru[i][jj] = tru[i-1][jj];
                    }

                    if( ( val == 0) || ( i == 0 && j >= 0) || tru[val-1][val-1] ){
                        for( int jj = val; jj < tru[0].length; jj++){
                        tru[i][jj] = true;
                    }
                }

                }
                
                else if ( str1.charAt(j) == str2.charAt(i) || str2.charAt(i) == '?' ){
                if(  (i> 0 && j > 0 && tru [i-1][j-1]) || (i == 1 && j == 0 && str2.charAt(i-1) == '*') ) 
                {   // && i>0
                    tru[i][j] = true;
                }
                
                // else if( i == 0)    tru[i][j] = false;
                
            }
            }

        }

        // System.out.print('.' + "\t" );
        // for( int i = 0 ; i < str1.length() ; i++){
        //     System.out.print(str1.charAt(i) + "\t");
        // }System.out.println();

        // for( int i = 0 ; i < tru.length; i++)
        // {
        //     System.out.print(str2.charAt(i) + "\t");
        //     for( int j = 0; j < tru[0].length; j++){
        //         System.out.print(tru[i][j] + "\t");
        //     }System.out.println();
        // }

    }

    
}