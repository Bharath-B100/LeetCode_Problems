// Last updated: 6/1/2026, 11:27:03 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int maxSum = nums[0];
4        int currentSum = nums[0];
5
6        for (int i=1;i<nums.length;i++) {
7            currentSum = Math.max(nums[i], currentSum + nums[i]);
8            maxSum =Math.max(maxSum, currentSum);
9        }
10        return maxSum;
11    }
12}