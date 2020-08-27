import java.util.*;
public class BbrickWall{

    public static void main( String[] args){
        
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        al.add(new ArrayList<Integer>(Arrays.asList(1,2,2,1)));
        al.add(new ArrayList<Integer>(Arrays.asList(3,1,2,0)));
        al.add(new ArrayList<Integer>(Arrays.asList(1,3,2,0)));
        al.add(new ArrayList<Integer>(Arrays.asList(2,4,0,0)));
        al.add(new ArrayList<Integer>(Arrays.asList(3,1,2,0)));
        al.add(new ArrayList<Integer>(Arrays.asList(1,3,1,1)));
   
        
        List<List<Integer>> al1 = new ArrayList<>();
        al1.add((Arrays.asList(1,2,2,1)));
        al1.add((Arrays.asList(3,1,2,0)));
        al1.add((Arrays.asList(1,3,2,0)));
        al1.add((Arrays.asList(2,4,0,0)));
        al1.add((Arrays.asList(3,1,2,0)));
        al1.add((Arrays.asList(1,3,1,1)));
        System.out.println(f(al1));
        
    }

   public static int f( List<List<Integer>> list){
   
    HashMap<Integer,Integer> hm = new HashMap<>();
   
    for( int i = 0 ; i < list.size(); i++){
        int ps = 0 ; //prefix sum
        // System.out.print(i + ". ");
        //6 rows but 6 columns  but  
        for( int j = 0 ; j < list.get(i).size() - 1; j++){
            
            ps+=list.get(i).get(j);
            // System.out.print(ps+ " ");
            hm.put(ps, hm.getOrDefault(ps, 0) + 1);
            //CAN CALCULATE THE MAX IN ABOVE LOOP 
        }  //  System.out.println();
    }

    int maxKey = -1;
    int maxVal = 0;
    for( int ele : hm.keySet()){
        // System.out.println(maxKey+" "+maxVal);
        if(hm.get(ele) > maxVal){  
             maxKey = ele;
             maxVal = hm.get(ele);
        }
    }
    
    return list.size() - maxVal;
   
    }
}

