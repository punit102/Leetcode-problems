class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        // IMP: If all element same and K = 1 then need (+1 index)
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the all occurance
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Bucket algorithms
        for (int key : map.keySet()) {
            int value = map.get(key);

            if (bucket[value] == null) {
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(key);
        }

        // Count total k elements
        int pos = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size() && pos < k; j++) {
                    result[pos] = bucket[i].get(j);
                    pos++;
                }
            }
        }
        return result;
    }
}