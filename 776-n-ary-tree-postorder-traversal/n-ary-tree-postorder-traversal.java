/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
         List<Integer> tree = new ArrayList();
         if (root == null) return tree;
         getPostOrder(root, tree);
         tree.add(root.val);
         return tree;
    }

    private void getPostOrder(Node node, List<Integer> tree){
        if(node == null){
            return;
        }
        for(Node child: node.children) {
            getPostOrder(child, tree);
            tree.add(child.val);
         }
    }
}