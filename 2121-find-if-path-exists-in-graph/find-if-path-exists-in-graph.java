import static java.util.Collections.addAll;

// class Solution {

//     boolean[] visited;
//     List<ArrayList<Integer>> listForEachNodeToConnectedNodes = new ArrayList<ArrayList<Integer>>();

//     // DFS way implementation
//     public boolean validPath(int n, int[][] edges, int source, int destination) {

//         visited = new boolean[n];

//         for (int i =0; i<n; i++){
//             listForEachNodeToConnectedNodes.add(new ArrayList<Integer>());
//         }

//         for (int[] edge: edges) {
//             int a = edge[0];
//             int b = edge[1];
//             listForEachNodeToConnectedNodes.get(a).add(b);
//             listForEachNodeToConnectedNodes.get(b).add(a);
//         }

//         dfs(source);
//         return visited[destination];
//     }

//     private void dfs(int source){
//         if(visited[source]) return;
//         visited[source] = true;

//         for (int coonectedNode: listForEachNodeToConnectedNodes.get(source)){
//             if (!visited[coonectedNode]){
//                 dfs(coonectedNode);
//             }
//         }
//     }

// }


// // BFS way
class Solution {

    private boolean[] visited;
    private ArrayList<ArrayList<Integer>> adj;
    private Queue<Integer> queue = new LinkedList<>();

    // BFS way implementation
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        visited = new boolean[n];
        adj = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<n ; i++){
            adj.add(new ArrayList<>());
        }

        for (int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        bfs(source);
        return visited[destination];
    }

    private void bfs(int source){
        queue.add(source);
        visited[source]= true;

        while(!queue.isEmpty()){
            // int u = queue.peek();
            int head = queue.poll();

            for(int neighbor: adj.get(head)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

}