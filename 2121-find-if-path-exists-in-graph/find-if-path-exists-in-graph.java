
import static java.util.Collections.addAll;

class Solution {
    boolean visited[];
    List<List<Integer>> gr;

    void dfs(int node) {
        if (visited[node])
            return;
        visited[node] = true;

        for (int child : gr.get(node)) {
            if (!visited[child]) {
                dfs(child);
            }
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        visited = new boolean[n];
        gr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            gr.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            gr.get(u).add(v);
            gr.get(v).add(u);
        }

        dfs(source);
        return visited[destination];
    }
}