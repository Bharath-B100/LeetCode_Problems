// Last updated: 8/11/2026, 10:05:25 AM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int max=0;
4        int n=accounts.length;
5        int m=accounts[0].length;
6        for(int i=0;i<n;i++){
7        int sum=0;
8            for(int j=0;j<m;j++){
9                sum = sum + accounts[i][j];
10            }
11            max = Math.max(max,sum);
12        }
13        return max;
14    }
15}