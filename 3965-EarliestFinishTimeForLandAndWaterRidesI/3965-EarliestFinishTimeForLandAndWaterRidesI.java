// Last updated: 6/6/2026, 9:37:57 AM
class Solution {
    public int earliestFinishTime(int[] startL, int[] durL, int[] startW, int[] durW) {
        int minL = Integer.MAX_VALUE, minW = Integer.MAX_VALUE , res =Integer.MAX_VALUE;
        int n = startL.length;
        int m = startW.length;
        for (int i = 0; i < n; i++)
            minL = Math.min(minL, startL[i] + durL[i]);
        for (int i = 0; i < m; i++) {
            minW = Math.min(minW, startW[i] + durW[i]);
            res = Math.min(res, Math.max(minL, startW[i]) + durW[i]);
        }
        for (int i = 0; i < n; i++){
            res = Math.min(res, Math.max(minW, startL[i]) + durL[i]);
        }
        return res;
    }
}