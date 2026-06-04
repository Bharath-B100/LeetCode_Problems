// Last updated: 6/5/2026, 12:25:44 AM
1class Solution {
2    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
3        int numrows = rowSum.length;
4        int colrows = colSum.length;
5        int[][] result = new int[numrows][colrows];
6        int i=0,j=0;
7        while(i<numrows && j<colrows){
8            int val = Math.min(rowSum[i], colSum[j]);
9            result[i][j] = val;
10            rowSum[i] -= val;
11            colSum[j] -= val;
12
13            if(rowSum[i] == 0){
14                i++;
15            }
16            if(colSum[j] == 0){
17                j++;
18            }
19        }
20        return result;
21    }
22}