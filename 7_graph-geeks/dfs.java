
class Traversal
{
    static int a = (int)1e4;
    static boolean[] vis = new boolean[a];
    static int ele = 0;
    
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
    {
       // add your code here
    //     ArrayList<Integer> al1 = new ArrayList<>();
    
    //     for( int i = 0 ; i < g.size(); i++){
    //         if( !vis[i]){
    //             ArrayList<Integer> al2 = dfs2(g, vis, i);
    //             al1.addAll(al2);
    //         }
    //     }
        
    //     return al1;
    // }
    // static ArrayList<Integer> dfs2( ArrayList<ArrayList<Integer>> g
    //                 , boolean[] vis, int ele){
        
        ArrayList<Integer> al2 = new ArrayList<>();
        
        if( g.size() == 0)  return al2;
        
        al2.add(ele);
        vis[ele] = true;
        for( int i = 0 ; i < g.get(ele).size(); i++){
            int ele2 = g.get(ele).get(i);
            System.out.println("here " + ele + " " + i + " " + ele2);
            dfs(g, N);
            // if( vis[ele2] == false){
            //     ele = ele2;
            //     ArrayList<Integer> al3 = dfs(g, N);
            //     // al2.addAll(al3);
            // } 
        }
        
             return al2;       
       }
}

