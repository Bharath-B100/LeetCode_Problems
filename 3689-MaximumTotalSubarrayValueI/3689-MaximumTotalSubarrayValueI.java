// Last updated: 6/9/2026, 9:30:47 AM
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        int n = nums.length-1;
4        Arrays.sort(nums);
5        return (long)k * (nums[n]-nums[0]);
6    }
7}