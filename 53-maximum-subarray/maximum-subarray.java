class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int curIndexSum = 0;

        for (int i = 0; i < nums.length; i++) {
            curIndexSum = curIndexSum + nums[i];

            if (curIndexSum > maxSum) {
                maxSum = curIndexSum;
            }

            if (curIndexSum < 0) {
                curIndexSum = 0;
            }
        }
        return maxSum;
    }
}