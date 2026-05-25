// Last updated: 5/25/2026, 11:17:41 AM
class Solution {
    List<List<String>> result = new ArrayList<>();
    boolean[] cols, diag1, diag2;

    private void backtrack(int row, int n, char[][] board) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (char[] r : board) temp.add(new String(r));
            result.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n;
            int d2 = row + col;

            if (cols[col] || diag1[d1] || diag2[d2]) continue;

            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;

            backtrack(row + 1, n, board);

            board[row][col] = '.';
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }

    public List<List<String>> solveNQueens(int n) {
        cols = new boolean[n];
        diag1 = new boolean[2 * n];
        diag2 = new boolean[2 * n];

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) Arrays.fill(board[i], '.');

        backtrack(0, n, board);
        return result;
    }
}
