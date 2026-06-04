// Last updated: 6/4/2026, 11:47:06 PM
1class Solution {
2    public int balancedStringSplit(String s) {
3        int count = 0;
4        int ch = 0;
5        for (int i = 0; i < s.length(); i++) {
6            if (s.charAt(i)=='R'){
7                ch++;
8            }else{
9                ch--;
10            }
11            if (ch==0){
12                count++;
13            }
14        }
15        return count;
16    }
17}