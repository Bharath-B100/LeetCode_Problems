// Last updated: 6/8/2026, 9:39:11 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int len = nums.length;
4        int[] ans = new int[len];
5        for (int i = 0; i < len; i++) {
6            if (i % 2 == 0) {
7                ans[i] = nums[i / 2];
8            } else {
9                ans[i] = nums[n + (i / 2)];
10            }
11        }
12        return ans;
13    }
14}