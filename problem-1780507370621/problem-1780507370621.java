// Last updated: 6/3/2026, 10:52:50 PM
1class Solution {
2    public int minSwaps(int[] nums) {
3        int k = Arrays.stream(nums).sum();
4        int n = nums.length;
5        int cnt = 0;
6        for (int i = 0; i < k; ++i) {
7            cnt += nums[i];
8        }
9        int mx = cnt;
10        for (int i = k; i < n + k; ++i) {
11            cnt += nums[i % n] - nums[(i - k + n) % n];
12            mx = Math.max(mx, cnt);
13        }
14        return k - mx;
15    }
16}