
import org.w3c.dom.Node;

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

        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        // System.out.println("Hello Program prequisites:");
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);

        while (true) {
            ArrayList<Integer> tempArray = new ArrayList<>();
            int size = queue.size();

            if (size == 0)
                return result;

            while (size > 0) {
                TreeNode temp = queue.peek();
                tempArray.add(temp.val);
                // System.out.println("Print element here: - " + temp.val);
                queue.poll();

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }

                size--;
            }

            result.add(tempArray);

        }

        // return result;

    }
}