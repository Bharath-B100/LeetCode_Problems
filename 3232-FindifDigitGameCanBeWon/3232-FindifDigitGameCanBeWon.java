// Last updated: 8/20/2026, 12:56:55 AM
1class Solution {
2    public boolean canAliceWin(int[] nums) {
3        int count1 = 0, count2 = 0;
4        int n = nums.length;
5        for(int i=0;i<n;i++){
6            if(nums[i]<10){
7                count1 = count1 + nums[i];
8            }
9            else{
10                count2 = count2 + nums[i];
11            }
12        }
13        return count1 != count2;
14    }
15}