// Last updated: 6/9/2026, 9:24:28 AM
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        long max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            max = Math.max(max,nums[i]);
6            min = Math.min(min,nums[i]);
7        }
8        return k * (max-min);
9    }
10}