// Last updated: 5/25/2026, 11:13:53 AM
import java.util.*;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        HashMap<Integer, ArrayList<int[]>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] t : times) {
            int u = t[0]; 
            int v = t[1]; 
            int w = t[2]; 
            map.get(u).add(new int[]{v, w});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );

        pq.add(new int[]{k, 0}); 
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int d = curr[1];

            if (d > dist[node]) continue;

            for (int[] nei : map.get(node)) {
                int nextNode = nei[0];
                int weight = nei[1];

                if (dist[nextNode] > d + weight) {
                    dist[nextNode] = d + weight;
                    pq.add(new int[]{nextNode, dist[nextNode]});
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                return -1;
            ans = Math.max(ans, dist[i]);
        }
        return ans;
    }
}
