// Last updated: 8/25/2026, 12:09:51 AM
1class Solution {
2    public int numSub(String s) {
3        long cnt = 0;
4        long tot = 0;
5        long mod = 1000000007;
6        for(int i=0;i<s.length();i++) {
7            if(s.charAt(i)=='1') {
8                cnt++;
9            }
10            else
11            {
12                cnt = 0;
13            }
14            tot=(tot+cnt) %mod;
15        }
16        return (int)tot;
17    }
18}