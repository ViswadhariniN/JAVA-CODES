class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();  // Remove spaces at the start and end
        int lastSpace = s.lastIndexOf(" ");
        return s.length() - lastSpace - 1;
    }
}