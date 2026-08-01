class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        int i = 0, j = 0;

        while (j < size) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return i+1;
    }
}