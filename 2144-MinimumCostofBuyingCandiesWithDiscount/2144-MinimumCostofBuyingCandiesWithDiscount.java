// Last updated: 6/1/2026, 10:18:22 AM
1class Solution {
2    public int minimumCost(int[] cost) {
3        int sum=0;
4        Arrays.sort(cost);
5        int c=0;
6        int total = 0;
7        for (int i = cost.length-1;i>=0;i--) {
8            if (c==2) 
9            {
10                c=0;
11                continue;
12            }
13            sum += cost[i];
14            c++;
15        }
16        return sum;
17    }
18}