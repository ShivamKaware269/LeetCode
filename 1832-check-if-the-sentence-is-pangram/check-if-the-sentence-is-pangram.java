class Solution {
    public boolean checkIfPangram(String sentence) {

        Set<Character> set = new HashSet<>();

        for(int i = 0; i < sentence.length(); i++) {
            char subject = sentence.charAt(i);
            set.add(subject);
        }

        boolean ans =false;

        if (set.size() == 26) {
            ans = true;
        }

        return ans;
    }
}