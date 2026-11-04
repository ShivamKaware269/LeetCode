class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int check : nums) {
            if(check > max) {
                max = check;
            }
        }

        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            while(nums[i] != max) {
                nums[i] += 1;
                count++;
            }
        }

        return count;
    }
}