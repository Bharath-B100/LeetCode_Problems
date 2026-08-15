// Last updated: 8/16/2026, 1:17:28 AM
1class Solution {
2    public int reverseDegree(String s) {
3        int ans = 0, idx = 1;
4        for (char ch:s.toCharArray()) {
5            ans+=(123 - (int) ch)*idx;
6            idx++;
7        }
8        return ans;
9    }
10}