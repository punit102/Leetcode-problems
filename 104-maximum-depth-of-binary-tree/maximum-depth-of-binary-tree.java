
import static java.lang.Math.max;

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
//  */
// class Solution {

//     public int maxDepth(TreeNode root) {
//         if (root == null) {
//             return 0;
//         }

//         int leftNode = maxDepth(root.left);
//         int rightNode = maxDepth(root.right);
//         return Math.max(leftNode, rightNode) + 1;
//     }

// }

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftCount = maxDepth(root.left) + 1;
        int rightCount = maxDepth(root.right) + 1;

        return Math.max(leftCount, rightCount);
    }

}






















