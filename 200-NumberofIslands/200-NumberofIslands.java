// Last updated: 5/31/2026, 6:48:56 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int c = 0;
6        for(int i = 0; i < m; i++){
7            for(int j = 0; j < n; j++){
8                if(grid[i][j] == '1'){
9                    dfs(grid, i, j);
10                    c++;
11                }
12            }
13        }
14        return c;
15    }
16    public void dfs(char[][] grid, int i, int j){
17        int m = grid.length;
18        int n = grid[0].length;
19        if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == '0'){
20            return;
21        }
22        grid[i][j] = '0';
23        dfs(grid, i+1, j);
24        dfs(grid, i-1, j);
25        dfs(grid, i, j+1);
26        dfs(grid, i, j-1);
27    }
28}