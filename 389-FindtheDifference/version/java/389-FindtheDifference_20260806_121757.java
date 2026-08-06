// Last updated: 8/6/2026, 12:17:57 PM
1class Solution {
2    public char findTheDifference(String s, String t) {
3        char ch1[] = s.toCharArray();
4        char ch2[] = t.toCharArray();
5        int sum1=0;
6        int sum2=0;
7        for(int i=0;i<s.length();i++){
8            sum1 = sum1 + ch1[i];
9        }
10        for(int i=0;i<t.length();i++){
11            sum2 = sum2 + ch2[i];
12        }
13        int ans = sum2-sum1;
14        return (char)ans;
15
16    }
17}