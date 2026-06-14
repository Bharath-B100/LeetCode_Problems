// Last updated: 6/14/2026, 8:55:33 AM
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        int dsum =0;
4        int sqsum=0;
5
6        while(n>0){
7            int digit = n%10;
8
9            dsum += digit;
10            sqsum += digit * digit;
11
12            n /= 10;
13        }
14        return (sqsum - dsum)>= 50;
15    }
16}