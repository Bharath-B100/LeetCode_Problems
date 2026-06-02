// Last updated: 6/2/2026, 12:39:06 PM
1class Solution {
2    public int earliestFinishTime(int[] startL, int[] durL, int[] startW, int[] durW) {
3        int minL = Integer.MAX_VALUE, minW = Integer.MAX_VALUE , res =Integer.MAX_VALUE;
4        int n = startL.length;
5        int m = startW.length;
6        for (int i = 0; i < n; i++)
7            minL = Math.min(minL, startL[i] + durL[i]);
8        for (int i = 0; i < m; i++) {
9            minW = Math.min(minW, startW[i] + durW[i]);
10            res = Math.min(res, Math.max(minL, startW[i]) + durW[i]);
11        }
12        for (int i = 0; i < n; i++){
13            res = Math.min(res, Math.max(minW, startL[i]) + durL[i]);
14        }
15        return res;
16    }
17}