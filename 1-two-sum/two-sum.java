class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> checkMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int secondNumber = target - nums[i];
            if (checkMap.containsKey(secondNumber)) {
                result[0] = i;
                result[1] = checkMap.get(secondNumber);
            }
            checkMap.put(nums[i], i);
        }

        return result;
    }
}