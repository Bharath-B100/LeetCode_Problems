// Last updated: 8/22/2026, 12:38:58 PM
1class Solution {
2    public int pivotInteger(int n) {
3      int total=n*(n+1)/2;
4      int x=(int) Math.sqrt(total);
5      if(x*x == total){
6        return x;
7      }
8      return -1;
9    }
10}