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
    public List<Integer> preorder(Node root) {
        List<Integer> tree = new ArrayList();
        if(root != null){
             preOrder(root, tree);
        }
        return tree;
    }

    private void preOrder(Node node, List<Integer> tree) {
        tree.add(node.val);
        for(Node child: node.children){
            if(child != null){
                preOrder(child, tree);
            }
        }
    }

}