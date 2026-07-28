// Last updated: 7/28/2026, 1:52:46 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        Arrays.sort(nums);
4        int max1=nums.length-2;
5        int max2=nums.length-1;
6        return (nums[max1]-1)*(nums[max2]-1);
7    }
8}