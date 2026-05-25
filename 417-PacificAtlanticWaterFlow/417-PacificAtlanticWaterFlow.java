// Last updated: 5/25/2026, 11:14:42 AM
import java.util.*;

class Solution {
    int[] x = {-1, 0, 1, 0};
    int[] y = {0, 1, 0, -1};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = heights.length, m = heights[0].length;
        int[][] v = new int[n][m]; 
        for (int i = 0; i < n; i++) fun(heights, v, n, m, i, 0, 1);   
        for (int j = 0; j < m; j++) fun(heights, v, n, m, 0, j, 1);  

        for (int i = 0; i < n; i++) fun(heights, v, n, m, i, m - 1, 2); 
        for (int j = 0; j < m; j++) fun(heights, v, n, m, n - 1, j, 2); 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (v[i][j] == 3) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
        return ans;
    }

    void fun(int[][] a, int[][] v, int n, int m, int i, int j, int ocean) {
        if (i < 0 || j < 0 || i >= n || j >= m)
            return;
        if ((v[i][j] & ocean) == ocean) 
            return;
        v[i][j] |= ocean; 
        for (int k = 0; k < 4; k++) {
            int ni = i + x[k], nj = j + y[k];
            if (ni >= 0 && nj >= 0 && ni < n && nj < m && a[ni][nj] >= a[i][j]) {
                fun(a, v, n, m, ni, nj, ocean);
            }
        }
    }
}