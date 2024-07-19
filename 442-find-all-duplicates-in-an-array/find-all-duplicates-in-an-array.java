// Approach
/* Initialize an empty list result to store the duplicates.
Iterate through the array.
For each element n, take its absolute value.
If the value at index n - 1 is positive, multiply it by -1.
If the value at index n - 1 is negative, add n to the result list.
Return the result list containing all duplicates.
*/


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num: nums){
            int n = Math.abs(num);

            if(nums[n-1] > 0){
                nums[n-1] = nums[n-1] * -1;
            } else{
                result.add(n);
            }
        }

    return result;    
    }
}