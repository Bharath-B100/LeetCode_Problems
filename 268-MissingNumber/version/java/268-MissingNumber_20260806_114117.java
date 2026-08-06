// Last updated: 8/6/2026, 11:41:17 AM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        Arrays.sort(nums);
5
6        if(nums[0]!=0){
7            return 0;
8        }
9        if(nums[n-1] !=n){
10            return n;
11        }
12        for(int i=0;i<n;i++){
13            if(nums[i]!=i){
14                return i;
15            }
16        }
17        return 0;
18    }
19}