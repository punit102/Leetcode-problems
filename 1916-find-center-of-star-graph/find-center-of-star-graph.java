class Solution {
    public int findCenter(int[][] edges) {
        int result = 0;
        int no_of_edges = edges.length;
        System.out.println("No of Edges: " + no_of_edges);
        HashMap<Integer, Integer> repeat_of_no = new HashMap<>();

        for (int i = 0; i < no_of_edges; i++) {
            for (int j = 0; j < 2; j++) {
                if (!repeat_of_no.containsKey(edges[i][j])) {
                    repeat_of_no.put(edges[i][j], 1);
                } else {
                    int temp_count = repeat_of_no.get(edges[i][j]);
                    repeat_of_no.put(edges[i][j], temp_count + 1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : repeat_of_no.entrySet()) {
            if (entry.getValue() == no_of_edges)
                result = entry.getKey();
        }
        return result;
    }
}