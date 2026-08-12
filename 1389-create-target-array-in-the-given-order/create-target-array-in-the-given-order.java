class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            ans.add(index[i],nums[i]);
        }

        int[] res = new int[nums.length];

        int ind = 0;

        for(int i: ans) {
            res[ind] = i;
            ind++;
        }

        return res;

    }
}