
import static java.lang.Integer.numberOfLeadingZeros;

// NOTE: When round robin condition is not applicable

/*
class Solution {
    public boolean canJump(int[] nums) {
        boolean result = false;
        int indexToCheck = nums.length - 1;
        if(nums.length == 1 && nums[0] == 1) {
            result = true;
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            if (indexToCheck == nums[i] + i) {
                result = true;
                break;
            }
        }
        return result;
    }
}
*/

// NOTE: Actual Problem
// Main idea to follow: goal <= i + nums[i]
// And move to the next index

class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0 ? true : false;
    }
}