// Last updated: 6/10/2026, 10:45:19 PM
1class Solution {
2    public int triangularSum(int[] nums) {
3        int n = nums.length;
4        for (int i=1;i<n;i++) {
5            for (int j=0;j<n-i;j++) {
6                nums[j]=(nums[j]+nums[j+1])%10;
7            }
8        }
9        return nums[0];
10    }
11}