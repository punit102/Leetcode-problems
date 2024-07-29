/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
// class Solution {
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//         if (root == null) {
//             return subRoot == null;
//         }

//         if (checkSameTree(root, subRoot))
//             return true;

//         return checkSameTree(root.left, subRoot) || checkSameTree(root.right, subRoot);
//     }

//     private boolean checkSameTree(TreeNode s, TreeNode t) {

//         if (s == null && t == null)
//             return true;

//         if (s == null || t == null)
//             return false;

//         if (s.val != t.val)
//             return false;

//         return checkSameTree(s.left, t.left) && checkSameTree(s.right, t.right);
//     }
// }



class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return subRoot==null;
        }
        if(isSametree(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
                
    }
    boolean isSametree(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null ||  q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSametree(p.left ,q.left) && isSametree(p.right,q.right);

    }
}
