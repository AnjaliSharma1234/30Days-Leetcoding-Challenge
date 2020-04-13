/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    int max ;
    public int diameterOfBinaryTree( TreeNode root ) {
        if ( root == null ) {
            return 0 ;
        }
        int [] res = helper(root) ;
        return max - 1 ;
    }
    
    public int[] helper ( TreeNode node ) {
        int[] res = new int[2] ;
        
        if ( node == null ) {
            return res ;
        }
        
        int[] l = helper( node.left ) ;
        int[] r = helper( node.right ) ;
        res[0] = 1 + l[1] + r[1] ;
        res[1] = 1 + Math.max(l[1] , r[1]);
        
        max = Math.max(Math.max(max, res[0]) , res[1] ) ;
        
        return res ;
    }
    
    
}
