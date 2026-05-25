// Last updated: 5/25/2026, 11:17:27 AM
class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        if (ob == null || ob[0][0] == 1) {
            return 0;
        }
        int m = ob.length;
        int n = ob[0].length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ob[i][j] == 1) {
                    dp[j] = 0;
                } else {
                    if (j > 0) {
                        dp[j] += dp[j - 1];
                    }
                }
            }
        }
        return dp[n - 1];        
    }
}