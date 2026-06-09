// Last updated: 6/9/2026, 9:58:16 AM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        String res = s+s;
4        if(s.length()!=goal.length()){
5            return false;
6        }
7        return res.contains(goal);
8    }
9}