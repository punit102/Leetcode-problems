class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int preFix = 1;
        result[0] = 1;

        System.out.println("Inital:" + result[0]);

        for (int i = 1; i < nums.length; i++) {
            result[i] = preFix * nums[i - 1];
            preFix = preFix * nums[i-1];
            // System.out.println("Check index Value:" + result[i]);
            // System.out.println("_-----------_");
        }

        int postFix = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            System.out.println("HERECheck Index value:" + result[i]);
            result[i] = postFix * result[i];
            postFix = postFix * nums[i];
            // // System.out.println("After Check index Value:" + result[i]);
            // System.out.println("_-----------_");
        }

        return result;
    }
}