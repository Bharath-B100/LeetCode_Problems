// Last updated: 8/22/2026, 11:04:54 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int wt = 0;
4        int max = 0;
5        for(int light:lights) {
6            max = Math.max(max, light);
7        }
8        for(int t:arrivalTime) {
9            if(t>=max) {
10                t =t % period;
11                if(t>=max) {
12                    wt = Math.max(wt, period - t);
13                }
14            }
15        }
16        return wt;
17    }
18}