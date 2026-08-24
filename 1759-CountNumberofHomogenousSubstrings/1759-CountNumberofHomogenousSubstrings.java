// Last updated: 8/25/2026, 12:15:31 AM
1class Solution {
2    public int countHomogenous(String s) {
3        long mod=1000000007;
4        long cnt=0;
5        long tot=0;
6        for(int i=0;i<s.length();i++)
7        {
8            if(i==0||s.charAt(i)==s.charAt(i-1))
9            {
10                cnt++;
11            }
12            else{
13                cnt=1;
14            }
15            tot=(tot+cnt)%mod;
16        }
17        return (int)(tot);
18    }
19}