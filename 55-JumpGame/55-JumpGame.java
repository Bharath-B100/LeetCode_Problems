// Last updated: 8/20/2026, 12:50:52 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int g = nums.length - 1;
4        for(int i=nums.length-2;i>=0;i--) {
5            if(i+nums[i]>=g) {
6                g=i;
7            }
8        }
9        return g == 0;        
10    }
11}