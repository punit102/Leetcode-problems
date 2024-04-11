class Solution {
 public int[] twoSum(int[] nums, int target) {

  int fp = 0;
  int sp = 0;
  int n[] = new int[2];
  int loop_count = (nums.length) * (nums.length);

  for (int p = 1; p <= loop_count; p++) {
   if ((p % nums.length) != 0) {
    sp++;
   } else if(((p % nums.length) == 0)){
    fp++;
    sp = 0;
        //System.out.println("FP in the ELSE:"+ fp);
      // System.out.println("SP in the ELSE:"+ sp);
   }

   int temp_sum = nums[fp] + nums[sp];
   if(temp_sum == target && fp!=sp)
   {
    n[0] = fp;
   n[1] = sp;
   break;
   }
   
  }

  return n;
 }
}