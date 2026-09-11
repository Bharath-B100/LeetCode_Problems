// Last updated: 9/11/2026, 12:01:47 PM
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int i = nums.length-1;
4        while(i>0 && nums[i-1]<nums[i]) {
5            i--;
6        }
7        return i;
8    }
9}