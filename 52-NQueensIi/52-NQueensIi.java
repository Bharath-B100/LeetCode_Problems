// Last updated: 5/25/2026, 11:17:39 AM
class Solution {
    int count = 0;
    boolean[] cols, diag1, diag2;

    private void backtrack(int row, int n) {
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n;
            int d2 = row + col;

            if (cols[col] || diag1[d1] || diag2[d2]) continue;

            cols[col] = diag1[d1] = diag2[d2] = true;
            backtrack(row + 1, n);
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }

    public int totalNQueens(int n) {
        cols = new boolean[n];
        diag1 = new boolean[2 * n];
        diag2 = new boolean[2 * n];

        backtrack(0, n);
        return count;
    }
}
