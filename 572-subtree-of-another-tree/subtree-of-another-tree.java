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
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
      return  s!=null && (validateSubtree(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t));
    }
    
    
    public boolean validateSubtree(TreeNode s, TreeNode t){
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null){
            return false;
        }
        
        return s.val == t.val && validateSubtree(s.left, t.left) && validateSubtree(s.right,t.right);
    }
}
