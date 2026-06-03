// Last updated: 6/3/2026, 10:26:01 PM
1class Solution {
2    public int numberOfArithmeticSlices(int[] nums) {
3        int n = nums.length;
4        if(n < 3){
5            return 0;
6        }
7        int res = 0;
8        int currentStreak = 0;
9        for(int i = 2; i < n; i++){
10            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
11                currentStreak++;
12            } else{
13                res += currentStreak*(currentStreak+1)/2;
14                currentStreak = 0;
15            }
16        }
17        res += currentStreak*(currentStreak+1)/2;
18        return res;
19    }
20}