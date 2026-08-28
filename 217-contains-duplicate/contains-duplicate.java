class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]) {
                ans = true;
                break;
            }
        }

        return ans;
    }
}