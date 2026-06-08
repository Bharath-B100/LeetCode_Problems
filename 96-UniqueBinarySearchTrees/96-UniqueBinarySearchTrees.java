// Last updated: 6/8/2026, 9:23:02 PM
1class Solution {
2    public int numTrees(int n) {
3        int[] uniqTree = new int[n + 1];
4        for (int i = 0; i <= n; i++) {
5            uniqTree[i] = 1;
6        }
7        for (int nodes = 2; nodes <= n; nodes++) {
8            int total = 0;
9            for (int root = 1; root <= nodes; root++) {
10                total += uniqTree[root - 1] * uniqTree[nodes - root];
11            }
12            uniqTree[nodes] = total;
13        }
14        return uniqTree[n];        
15    }
16}