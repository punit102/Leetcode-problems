class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n != 0 && m != 0) {
            int total_elements = m + n;
            for (int i= total_elements - n, j = 0 ; i < total_elements; i++, j++) {
                nums1[i] = nums2[j];
            }    
        } else if (m == 0 && n!= 0) {
            int total_elements = n;
            for(int i = 0; i < n; i++){
                nums1[i] = nums2[i];
            }
        }
        Arrays.sort(nums1);
    }
}