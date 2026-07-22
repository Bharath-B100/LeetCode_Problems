// Last updated: 7/22/2026, 9:49:25 AM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int res = 0;
4
5        String[] word = s.split(" ");
6        res = word[word.length-1].length();
7        return res;
8    }
9}