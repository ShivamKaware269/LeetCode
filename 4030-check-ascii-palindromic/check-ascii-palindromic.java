class Solution {
    public boolean isPalindromic(String s) {
        if(s == null) return false;

        StringBuilder binary = new StringBuilder();

        // Binary Conversion
        for(char c : s.toCharArray()){
            String binaryBytes = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
            binary.append(binaryBytes);
        }

        String reg = binary.toString();
        String rev = binary.reverse().toString();

        boolean val = reg.equals(rev);

        return val;
        
        
    }
}