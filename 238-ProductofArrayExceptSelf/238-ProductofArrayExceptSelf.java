// Last updated: 6/14/2026, 11:04:18 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] ans = new int[nums.length];
4        ans[0]=1;
5        for(int i=1;i<nums.length;i++){
6            ans[i]=ans[i-1]*nums[i-1];
7        }
8        int suffix=1;
9        for(int i=nums.length-1;i>=0;i--){
10            ans[i]=ans[i]*suffix;
11            suffix=suffix*nums[i];
12        }
13        return ans;
14    }
15}