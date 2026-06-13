// Last updated: 6/13/2026, 5:57:21 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int n = word1.length();
4        int m = word2.length();
5        int dp[][] = new int[n+1][m+1];
6        for(int i = 1; i <= n; i++){
7            for(int j = 1; j <= m; j++){
8                if(word1.charAt(i-1) == word2.charAt(j-1)){
9                    dp[i][j] = dp[i-1][j-1] + 1;
10                }
11                else {
12                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
13                }
14            }
15        }
16        int ans = n + m - dp[n][m] * 2;
17        return ans;
18    }
19}