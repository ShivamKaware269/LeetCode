class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                ans = mid;     // mid could be the potential answer (floor value)
                left = mid + 1; // Try to find a larger valid integer
            } else {
                right = mid - 1; // mid is too large
            }
        }
        return ans;
    }
}