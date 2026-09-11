// Last updated: 9/11/2026, 11:47:00 AM
1class Solution {
2    public int scoreDifference(int[] nums) {
3        int sum1 =0,sum2=0;
4        Boolean b = true;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]%2==1) b = !b;
7            if(i%6==5) b = !b;
8            if(b) sum1 += nums[i];
9            else sum2 += nums[i];
10        }
11        return sum1 - sum2;
12    }
13}