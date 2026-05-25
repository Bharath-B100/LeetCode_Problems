// Last updated: 5/25/2026, 11:10:17 AM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a,b) -> b[k] - a[k]);
        return score;
    }
}