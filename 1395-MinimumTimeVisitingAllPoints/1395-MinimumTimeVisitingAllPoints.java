// Last updated: 5/25/2026, 11:12:41 AM
class Solution {
    public int minTimeToVisitAllPoints(int[][] p) {
        int ans = 0;
        for (int i=1;i<p.length;i++) {
            ans = ans+Math.max(Math.abs(p[i][0] - p[i - 1][0]) ,Math.abs (p[i][1] - p[i - 1][1]) );
        }
        return ans;
    }
}