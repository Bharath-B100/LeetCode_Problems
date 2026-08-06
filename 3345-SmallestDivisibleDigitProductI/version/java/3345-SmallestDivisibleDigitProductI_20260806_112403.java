// Last updated: 8/6/2026, 11:24:03 AM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        while(true) {
4        int p = 1;
5        int temp = n;
6            while(temp > 0) {
7                int d= temp%10;
8                p =p*d;
9                temp = temp/10;
10            }
11            if(p%t==0) {
12                return n;
13            }
14            else{
15                n++;
16            }
17        }
18    }
19}