// Last updated: 8/28/2026, 10:52:20 AM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Stack<Character> st1 = new Stack<>();
4        Stack<Character> st2 = new Stack<>();
5        for (int i = 0; i < s.length(); i++) {
6            if (!st1.isEmpty() && s.charAt(i) == '#') {
7                st1.pop();
8            } else if (s.charAt(i) != '#') {
9                st1.push(s.charAt(i));
10            }
11        }
12        for (int i = 0; i < t.length(); i++) {
13            if (!st2.isEmpty() && t.charAt(i) == '#') {
14                st2.pop();
15            } else if (t.charAt(i) != '#') {
16                st2.push(t.charAt(i));
17            }
18        }
19        boolean isSame = st1.equals(st2);
20        return isSame;
21    }
22}