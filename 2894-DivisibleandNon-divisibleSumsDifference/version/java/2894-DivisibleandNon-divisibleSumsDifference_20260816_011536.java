// Last updated: 8/16/2026, 1:15:36 AM
1class Solution {
2    public int differenceOfSums(int n, int m) {
3        int num1=0, num2=0;
4        for(int i=1;i<=n;i++) {
5            if(i%m == 0)num2 += i;
6            else num1 += i;
7        }
8        return num1-num2;
9    }
10}