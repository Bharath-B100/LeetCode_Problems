// Last updated: 8/10/2026, 2:52:18 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            if(nums[i]<0){
5            nums[i] = nums[i] * -1;
6            }
7        }
8        Arrays.sort(nums);
9        int ans[] = new int[nums.length];
10        for(int i=0;i<nums.length;i++){
11            ans[i] = nums[i]*nums[i];
12        }
13        return ans; 
14    }
15}