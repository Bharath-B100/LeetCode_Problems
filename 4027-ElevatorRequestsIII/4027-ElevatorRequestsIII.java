// Last updated: 8/22/2026, 2:25:13 PM
1class Solution {
2    public int elevatorRequests(int n, int[] r) {
3        int s = r[0],sum = 0;
4        for(int i=1;i<r.length;i++){
5            sum+=s;
6            s = Math.abs(r[i-1]-r[i]);
7        }
8        return sum+s;
9    }
10}