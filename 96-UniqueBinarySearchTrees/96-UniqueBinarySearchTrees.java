// Last updated: 6/8/2026, 9:27:04 PM
1class Solution {
2    public int alternatingSum(int[] nums) {
3        int sum = 0;
4
5        for(int i=0;i<nums.length;i++){
6            if(i%2 == 0)sum+=nums[i];
7            else sum-=nums[i];
8        }
9
10        return sum;
11    }
12}