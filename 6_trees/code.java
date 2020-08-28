/**	
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 * s        this.right = right;
 *    }
 * }
 */
Right side view
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ll = new ArrayList<>();
        
        if( root == null)   return ll;
        
        queue.add(root);
        while( queue.size() > 0){
            int count = queue.size();//count of previous elements in queue
            while( count-- > 0){
                TreeNode nn = queue.remove();
                if( nn.left != null){
                    queue.add(nn.left);
                }
                if( nn.right != null){
                    queue.add(nn.right);
                }
                if( count == 0){	
                    ll.add(nn.val);
                }
            }        
        }
        return ll;        }}
left view

class Tree
{
    void leftView(Node root)
    {
        Queue<Node> queue = new LinkedList<>();
        // List<Integer> ll = new ArrayList<>();
        
        if( root == null)   return ;
        
        queue.add(root);
        while( queue.size() > 0){
            int count = queue.size();//count of previous elements in queue
            boolean first = true;
            while( count-- > 0){
                Node nn = queue.remove();
                if( nn.left != null){
                    queue.add(nn.left);
                }
                if( nn.right != null){
                    queue.add(nn.right);
                }
                if( first == true){
                    System.out.print(nn.data + " ");	//syso here only
                    first = false;
                }
         }        
     }
 Top view

	public static void topView(Node root) {
        Queue<c> q = new LinkedList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        c rootEle = new c(root,0);
        q.add(rootEle);

        while( q.size() > 0){
            int count = q.size();
            while( count-- > 0){
                c ele = q.remove();
                if( !hm.containsKey(ele.vl)){
                    hm.put(ele.vl, ele.node.data );
                }
                Node ele1 = ele.node;
                if( ele1.left != null){
                    q.add(new c(ele1.left,ele.vl - 1))
                ;}
                if( ele1.right != null){
                    q.add(new c(ele1.right,ele.vl + 1))
                ;}
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for( int ele2 : hm.keySet()){
            min = Math.min(ele2, min);
            max = Math.max(ele2, max);
        }

        for( int i = min ; i <= max; i++){
            System.out.print(hm.get(i) + " ");
        }System.out.println();
    }

Bottom view
    public void bottomView(Node root)
    {
        Queue<c> q = new LinkedList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        c rootEle = new c(root,0);
        q.add(rootEle);

        while( q.size() > 0){
            int count = q.size();
            while( count-- > 0){
                c ele = q.remove();
             
                hm.put(ele.vl, ele.node.data );
                //always put element in the queue
                
                Node ele1 = ele.node;
                if( ele1.left != null){
                    q.add(new c(ele1.left,ele.vl - 1))
                ;}
                if( ele1.right != null){
                    q.add(new c(ele1.right,ele.vl + 1))
                ;}
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
            // System.out.println("keyset");
        for( int ele2 : hm.keySet()){
            // System.out.print( ele2 + " ");
            min = Math.min(ele2, min);
            max = Math.max(ele2, max);
        }

        for( int i = min ; i <= max; i++){
            System.out.print(hm.get(i) + " ");
        }   
        //System.out.println();
    }} 





































Lca bst

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor( root.right, p, q);
        }      
        else if( p.val < root.val && q.val < root.val){
            return lowestCommonAncestor( root.left, p, q);
        }    
        else if( (p.val < root.val && q.val > root.val) ||
                (p.val > root.val && q.val < root.val))
        {
            return root;
        }    
        else{ // if( p.val == root.val || q.val == root.val){

            return root;
        }    
}}


Lca b-tree

class Tree
{

/* If n1 and n2 are present, return reference
   to LCA. If both are not present, return 
   null,. Else if left subtree contains any 
   of them return pointer to left.*/
	Node lca(Node root, int n1,int n2)
	{
		// Your code here   
        if( root == null)   return null;
        Node l = lca( root.left, n1, n2);
        Node r = lca( root.right, n1, n2);
        
        if( root.data == n1 || root.data == n2)
            return root;
        else if( l != null && r != null)
            return root;
        else if( l != null)
            return l;
        else if( r != null)
            return r;
        else{//both null
            return null;
        }
        
	}
}







Find tree from inorder preorder

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> hm = new HashMap<>();

        for( int i = 0 ; i < inorder.length; i++){
            hm.put( inorder[i], i);    
        }
        return f( preorder, 0 , preorder.length - 1, inorder, 0 , inorder.length - 1, hm);
    
    }
    
    TreeNode f( int[] p, int ps, int pe, int[] i , int is, int ie, Map<Integer, Integer> hm){
        
        if( ps > pe || is > ie)     return null;
        
        TreeNode nn = new TreeNode(p[ps]);
        int idx = hm.get(p[ps]);
        
        int count = idx - is;//bcz 3 - 0 = 3 elements
                            // to exclude one element
        nn.left = f( p, ps + 1, ps + count, i, is, idx - 1, hm);
        nn.right = f( p, ps + count + 1, pe, i , idx + 1 , ie, hm);
          //can also find the right elements from left itself
      
        return nn;
    }    
}
Find tree from inorder postorder
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> hm = new HashMap<>();
        for( int i = 0 ; i < inorder.length; i++){
            hm.put( inorder[i], i);
        }
        
        return f( inorder, 0, inorder.length - 1, postorder, 0 ,postorder.length - 1, hm);
    }
    
    TreeNode f( int[] in , int is, int ie, int[] po, int ps, int pe, Map<Integer,Integer> hm){
 
        if( is > ie || ps > pe){
            return null;
        }
        
        TreeNode nn = new TreeNode( po[pe]);
        int idx = hm.get(po[pe]);
        
        int count = idx - is;// bcz 3 - 0 == 3 elements
                            // to exclude one element
        nn.left = f(in, is, idx - 1 , po, ps, ps + count - 1, hm);
        nn.right = f( in, idx + 1, ie, po, ps + count, pe - 1, hm);
        //can also find the right elements from left itself
        
        return nn;
    }
}

