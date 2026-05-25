// Last updated: 5/25/2026, 11:17:30 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int res =0;
        String[] part = s.split(" ");
        int n =part.length;
        res = part[part.length-1].length();
        return res;
    }
}