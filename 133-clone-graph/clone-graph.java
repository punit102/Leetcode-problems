/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

/*
// BFS solution
class Solution {
    public Node cloneGraph(Node node) {

        if(node == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        queue.offer(node);
        map.put(node, new Node(node.val, new ArrayList<>()));

        while(!queue.isEmpty()){
            Node head = queue.poll();

            for (Node neighbor: head.neighbors) {
                if(!map.containsKey(neighbor)){
                    map.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
                    queue.add(neighbor);
                }
                map.get(head).neighbors.add(map.get(neighbor));
            }

        }

    return map.get(node);    
    }
}
*/


// DFS Solution
class Solution {
    private HashMap<Node, Node> visited = new HashMap<>() ;

    public Node cloneGraph(Node node) {

        if(node == null) return node;

        if(visited.containsKey(node)) return visited.get(node);

        Node cloneNode = new Node(node.val, new ArrayList<>());
        visited.put(node, cloneNode);

        for(Node neighbor: node.neighbors){
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }

    return cloneNode;
    }
}
