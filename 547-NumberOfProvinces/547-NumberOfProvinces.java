// Last updated: 5/25/2026, 11:14:18 AM
class Solution {

    static boolean[] vis;

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            vis[i] = false;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i, isConnected, n);
                count++;
            }
        }
        return count;
    }

    static void dfs(int start, int[][] graph, int n) {
        vis[start] = true;
        for (int j = 0; j < n; j++) {
            if (graph[start][j] == 1 && !vis[j]) {
                dfs(j, graph, n);
            }
        }
    }
}
