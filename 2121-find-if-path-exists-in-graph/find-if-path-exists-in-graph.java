import static java.util.Collections.addAll;

class Solution {

    boolean[] visited;
    List<ArrayList<Integer>> listForEachNodeToConnectedNodes = new ArrayList<ArrayList<Integer>>();

    // DFS way implementation
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        visited = new boolean[n];

        for (int i =0; i<n; i++){
            listForEachNodeToConnectedNodes.add(new ArrayList<Integer>());
        }

        for (int[] edge: edges) {
            int a = edge[0];
            int b = edge[1];
            listForEachNodeToConnectedNodes.get(a).add(b);
            listForEachNodeToConnectedNodes.get(b).add(a);
        }

        dfs(source);
        return visited[destination];
    }

    private void dfs(int source){
        if(visited[source]) return;
        visited[source] = true;

        for (int coonectedNode: listForEachNodeToConnectedNodes.get(source)){
            if (!visited[coonectedNode]){
                dfs(coonectedNode);
            }
        }
    }

}


// // BFS way
// class Solution {


//     // BFS way implementation
//     public boolean validPath(int n, int[][] edges, int source, int destination) {

//         return false;
//     }

// }