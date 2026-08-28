// Last updated: 8/28/2026, 12:13:16 PM
1class Solution {
2    public int minimumLength(String s) {
3        int i = 0;
4        int j = s.length() - 1;
5        while(i < j) {
6            if(s.charAt(i)!=s.charAt(j)) {
7                break;
8            }
9            if(s.charAt(i)==s.charAt(j)) {
10                char ch=s.charAt(i);
11                while(i <= j && s.charAt(i) == ch) {
12                    i++;
13                }
14                while(j >= i && s.charAt(j) == ch) {
15                    j--;
16                }
17            }
18        }
19        return j - i + 1;
20    }
21}
22