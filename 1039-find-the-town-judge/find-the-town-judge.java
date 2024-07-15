class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1) return 1;
        int result = -1;
        int matchValue = n - 1;
        HashMap<Integer, Integer> inBound = new HashMap<>();
        HashMap<Integer, Integer> outBound = new HashMap<>();

        for (int[] entry : trust) {
            int temp_outbound = entry[0];
            int temp_inbound = entry[1];
            if (!outBound.containsKey(temp_inbound)) {
                outBound.put(temp_outbound, 1);
            } else {
                int temp = outBound.get(temp_inbound);
                outBound.put(temp_outbound, temp + 1);
            }

            if (!inBound.containsKey(temp_inbound)) {
                inBound.put(temp_inbound, 1);
            } else {
                int temp = inBound.get(temp_inbound);
                inBound.put(temp_inbound, temp + 1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : inBound.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == matchValue && !outBound.containsKey(key)) {
                result = key;
                break;
            }
        }

        return result;
    }
}