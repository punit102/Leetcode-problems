class Solution {
    public int removeDuplicates(int[] nums) {
        int temp_memory = nums[0];
        int result = 1;
        int j = 1;
        for (int i = 1; i< nums.length ; i++) {
            if(nums[i] != temp_memory){
                nums[j] = nums[i];
                temp_memory = nums[i];
                j += 1;
                result += 1;
            }
        }
        return result;
    }
}