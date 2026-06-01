// Last updated: 6/1/2026, 11:28:15 PM
1class Solution {
2    public int climbStairs(int n) {
3        if(n == 1)
4        {
5            return 1;
6        }
7        if(n == 2)
8        {
9            return 2;
10        }
11        int[] arr = new int[n+1];
12            arr[1] = 1;
13            arr[2] = 2;
14        for(int i=3;i<=n;i++) {
15            arr[i] = arr[i-1]+arr[i-2];
16        }
17        return arr[n];
18    }
19}