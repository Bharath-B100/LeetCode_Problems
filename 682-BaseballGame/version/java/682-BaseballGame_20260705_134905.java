// Last updated: 7/5/2026, 1:49:05 PM
1class Solution {
2    public int jump(int[] nums) {
3        int n = nums.length;
4        if (n <= 1) return 0;
5        int jumps = 0;
6        int currEnd = 0;
7        int maxReach = 0;
8        for (int i = 0; i < n - 1; i++) {
9            maxReach = Math.max(maxReach, i + nums[i]);
10            if (i == currEnd) {
11                jumps++;
12                currEnd = maxReach;
13                if (currEnd >= n - 1) break;
14            }
15        }
16
17        return jumps;
18    }
19}