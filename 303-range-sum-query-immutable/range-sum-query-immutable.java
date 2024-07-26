// Note: Please use Pre Sum Algorithm pattern

class NumArray {

    int[] given;

    public NumArray(int[] nums) {

        int lengthOfNums = nums.length;
        for(int i = 1; i < lengthOfNums; i++) {
            nums[i] = nums[i] + nums[i-1];
        }

        for(int i: nums){
            System.out.println("Given index:" + i);
        }
        given = nums;
        
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return given[right];
        } else {
            return given[right] - given[left-1];
        }
    }


}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */