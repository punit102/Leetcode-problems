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

    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        countHeightOnEachNode(root);
        return diameter;

    }

    private int countHeightOnEachNode(TreeNode root) {
        if (root == null)
            return 0;

        int left = countHeightOnEachNode(root.left);
        int right = countHeightOnEachNode(root.right);

        diameter = Math.max(left + right, diameter);

        return Math.max(left, right) + 1;

    }

}