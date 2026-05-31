// Last updated: 5/31/2026, 6:49:27 PM
1class Solution {
2    public void solve(char[][] board) {
3        int m = board.length;
4        int n = board[0].length;
5        boolean[][] vis = new boolean[m][n];
6        for(int i =0;i<m;i++){
7            if(board[i][0] == 'O' && vis[i][0] == false){
8                dfs(i,0,board,vis);
9            }
10            if(board[i][n-1] == 'O' && vis[i][n-1] == false){
11                dfs(i,n-1,board,vis);
12            }
13        }
14        for(int j = 0;j<n;j++){
15            if(board[0][j] == 'O' && vis[0][j] == false){
16                dfs(0,j,board,vis);
17            }
18            if(board[m-1][j] == 'O' && vis[m-1][j] == false){
19                dfs(m-1,j,board,vis);
20            }
21        }
22        for(int i =0;i<m;i++){
23            for(int j =0;j<n;j++){
24                if(board[i][j] == 'O' && vis[i][j] == false){
25                    board[i][j] = 'X';
26                }
27            }
28        }
29    }
30    
31    public void dfs(int i, int j, char[][] board, boolean[][] vis){
32        int m = board.length;
33        int n = board[0].length;
34        if(i<0 || j<0 || i>=m || j>=n || vis[i][j] == true || board[i][j] == 'X'){
35            return;
36        }
37        
38        vis[i][j] = true;
39        dfs(i+1,j,board,vis);
40        dfs(i,j+1,board,vis);
41        dfs(i-1,j,board,vis);
42        dfs(i,j-1,board,vis);
43    }
44}