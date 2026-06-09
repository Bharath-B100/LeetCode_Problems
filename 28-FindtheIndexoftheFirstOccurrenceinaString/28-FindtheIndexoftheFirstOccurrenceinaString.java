// Last updated: 6/9/2026, 10:07:04 AM
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        String res = s + s;
4        String str =res.substring(1,res.length()-1);
5        return str.contains(s);
6    }
7}