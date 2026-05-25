// Last updated: 5/25/2026, 11:13:41 AM
import java.util.*;

class Solution {
    public int findCheapestPrice(int n, int[][] flights,int src, int dst, int k) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[src] = 0;    
        for (int i = 0; i <= k; i++) {
            int[] temp = dp.clone();
            for (int[] f : flights) {
                int u = f[0];
                int v = f[1];
                int cost = f[2];
                if (dp[u] != Integer.MAX_VALUE) {
                    temp[v] = Math.min(temp[v], dp[u] + cost);
                }
            }

            dp = temp;
        }

        return dp[dst] == Integer.MAX_VALUE ? -1 : dp[dst];
    }
}
