import static java.util.Collections.addAll;

class Solution {

    boolean[] visited;
    List<ArrayList<Integer>> eachNodeconnectedEdges = new ArrayList<ArrayList<Integer>>();

    // DFS way implementation
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        visited = new boolean[n];

        for (int i =0; i<n; i++){
            eachNodeconnectedEdges.add(new ArrayList<Integer>());
        }

        for (int[] edge: edges) {
            int a = edge[0];
            int b = edge[1];
            eachNodeconnectedEdges.get(a).add(b);
            eachNodeconnectedEdges.get(b).add(a);
        }

        dfs(source);
        return visited[destination];
    }

    private void dfs(int source){
        if(visited[source]) return;
        visited[source] = true;

        for (int coonectedNode: eachNodeconnectedEdges.get(source)){
            if (!visited[coonectedNode]){
                dfs(coonectedNode);
            }
        }
    }

}