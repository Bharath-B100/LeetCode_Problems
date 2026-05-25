// Last updated: 5/25/2026, 11:13:43 AM
import java.util.*;

class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] vis = new boolean[n][n];
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        pq.add(new int[]{grid[0][0],0,0});
        vis[0][0] = true;
        int res = 0;
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int h = cur[0], r = cur[1], c = cur[2];
            res = Math.max(res, h);
            if(r == n-1 && c == n-1) return res;
            for(int[] d : dir){
                int nr = r + d[0], nc = c + d[1];
                if(nr>=0 && nr<n && nc>=0 && nc<n && !vis[nr][nc]){
                    vis[nr][nc] = true;
                    pq.add(new int[]{grid[nr][nc], nr, nc});
                }
            }
        }
        return res;
    }
}
