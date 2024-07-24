class Solution {

    private boolean dfsRec(int source, int[][] graph, boolean[] visited, boolean[] eachLoopVisited,
            boolean[] checkCycle) {
        visited[source] = true;
        eachLoopVisited[source] = true;

        for (int j : graph[source]) {
            if (visited[j] == false) {
                if (dfsRec(j, graph, visited, eachLoopVisited, checkCycle)) {
                    return checkCycle[source] = true;
                }
            } else if (visited[j] == true && eachLoopVisited[j] == true) {
                return checkCycle[source] = true;
            }
        }

        eachLoopVisited[source] = false;
        return false;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        boolean[] eachLoopVisited = new boolean[graph.length];
        boolean[] checkCycle = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (visited[i] == false) {
                dfsRec(i, graph, visited, eachLoopVisited, checkCycle);
            }
        }

        for (int i = 0; i < checkCycle.length; i++) {
            if (!checkCycle[i]) {
                result.add(i);
            }
        }

        return result;
    }
}