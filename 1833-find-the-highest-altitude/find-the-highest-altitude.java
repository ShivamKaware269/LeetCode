class Solution {
    public int largestAltitude(int[] gain) {

        int high = 0;
        int sub = 0;

        for(int i = 0; i < gain.length; i++) {
            sub = sub + gain[i];
            
            if(high < sub) {
                high = sub;
            }
        }

        return high;
    }
}