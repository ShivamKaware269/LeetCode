class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] perarray = new int[n]; 

        for(int i = 0; i < n; i++) {
            perarray[i] = nums[nums[i]];
        }

        return perarray;
    }
}