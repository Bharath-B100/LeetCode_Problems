// Last updated: 7/20/2026, 10:12:56 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int ans[]= new int[nums.length*2];
4    
5        for(int i=0;i<ans.length;i++)
6        {
7            ans[i] = nums[i % nums.length];
8        }
9        return ans;
10    }
11}