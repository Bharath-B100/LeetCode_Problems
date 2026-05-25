// Last updated: 5/25/2026, 11:16:42 AM
class Solution {
    int[][] dp;
    public int maxProfit(int[] prices) {
        int n = prices.length;
        dp = new int[2][3];
        for(int i=n;i>=0;--i){
            for(int k=0;k<=2;k++){
                for(int j=0;j<=1;j++){
                    if(i>=n || k==0){dp[j][k] = 0;
                    continue;
                    }
                    int out = dp[j][k];
                    if(j==0)out = Math.max(out, dp[1][k]-prices[i]);
                    else out = Math.max(out, dp[0][k-1]+prices[i]);
                    dp[j][k] = out;
                }
            }
        }
        return dp[0][2];
    }
}