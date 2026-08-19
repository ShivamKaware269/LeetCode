class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = 0;
        int found = -1;

        while(start <= end) {

            mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } 
            if (target < nums[mid]) {
                end = mid - 1;
            }
            if(target == nums[mid]) {
                found = mid;
                break;
            }
        }
        return found;
    }
}