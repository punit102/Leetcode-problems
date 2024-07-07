class Solution {
    public int findCenter(int[][] edges) {
        int result = 0;
        int no_of_edges = edges.length;
        HashMap<Integer, Integer> check_repeat = new HashMap<>();

        // for (int i = 0; i < no_of_edges; i++) {
        // for (int j = 0; j < 2; j++) {
        // if (!repeat_of_no.containsKey(edges[i][j])) {
        // repeat_of_no.put(edges[i][j], 1);
        // } else {
        // int temp_count = repeat_of_no.get(edges[i][j]);
        // repeat_of_no.put(edges[i][j], temp_count + 1);
        // }
        // }
        // }

        // for (Map.Entry<Integer, Integer> entry : repeat_of_no.entrySet()) {
        // if (entry.getValue() == no_of_edges)
        // result = entry.getKey();
        // }

        for (int[] arr : edges) {
            check_repeat.put(arr[0], check_repeat.getOrDefault(arr[0], 0) + 1);
            check_repeat.put(arr[1], check_repeat.getOrDefault(arr[1], 0) + 1);
        }

        for (int key : check_repeat.keySet()) {
            if (check_repeat.get(key) == no_of_edges)
                result = key;
        }

        return result;
    }
}