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
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // if(root != null) System.out.println("Check your current Node:" + root.val);
       
        if (root == null)
            return false;

        int sum = targetSum;

        if (root != null) {
            sum = targetSum - root.val;
        }

        if (root.right == null && root.left == null && sum == 0)
            return true;

        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);

    }
}