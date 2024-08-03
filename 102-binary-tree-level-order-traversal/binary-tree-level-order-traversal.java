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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return result;

        queue.add(root);

        while(true){
            int size = queue.size();
            List<Integer> tempRes = new ArrayList<Integer>();

            if(size == 0) return result;

            while(size > 0) {
                TreeNode element = queue.poll();
                tempRes.add(element.val);

                if(element.left != null) queue.add(element.left);
                if(element.right != null) queue.add(element.right);
                size--;
            }

            result.add(tempRes);

        }

    }
}