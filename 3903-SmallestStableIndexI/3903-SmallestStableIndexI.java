// Last updated: 9/6/2026, 10:16:50 AM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4        int[] suffix = new int[n];
5 
6        int mn = Integer.MAX_VALUE;
7        for (int i = n - 1; i >= 0; i--) {
8            mn = Math.min(mn, nums[i]);
9            suffix[i] = mn;
10        }
11        int mx = 0;
12        for (int i = 0; i < n; i++) {
13            mx = Math.max(mx, nums[i]);
14            int score = mx - suffix[i];
15            if (score <= k)
16                return i;
17        }
18 
19        return -1;
20    }
21}