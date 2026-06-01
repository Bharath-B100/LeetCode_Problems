// Last updated: 6/1/2026, 11:28:36 PM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int[] dp = new int[amount + 1];
4        for (int i = 1; i <= amount; i++)
5            dp[i] = amount + 1;
6            dp[0] = 0;
7        for (int i = 1; i <= amount; i++) {
8            for (int j = 0; j < coins.length; j++) {
9                if (coins[j] <= i) {
10                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
11                }
12            }
13        }
14        if (dp[amount] == amount + 1) return -1;
15        return dp[amount];
16    }
17}
18