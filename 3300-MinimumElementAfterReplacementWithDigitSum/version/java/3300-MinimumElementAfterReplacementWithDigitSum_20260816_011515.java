// Last updated: 8/16/2026, 1:15:15 AM
1class Solution {
2    public int minElement(int[] nums) {
3        int res=36;
4        for(int n:nums)
5            res = Math.min(res, n-9*((n/10)+(n/100)+(n/1000)+(n/10000)));
6        return res;
7    }
8}