class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min_index = 0;
        int max_index = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] < nums[min_index]) {
                min_index = i;
            }
            if(nums[i] > nums[max_index]) {
                max_index = i;
            }
        }

        int l = Math.min(min_index,max_index);
        int r = Math.max(min_index,max_index);
        // Assuming smaller index -> l; larger index -> r;

        int case_1 =  r + 1; // removing both elements from front
        int case_2 =  n - l; // removing both elements from end
        int case_3 =  (l + 1) + (n - r); // removing both elements from both sides 

        return Math.min(case_1, Math.min(case_2,case_3));

    }
}