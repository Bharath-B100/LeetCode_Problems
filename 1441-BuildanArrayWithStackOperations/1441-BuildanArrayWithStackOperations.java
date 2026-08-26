// Last updated: 8/26/2026, 2:53:47 PM
1class Solution {
2    public List<String> buildArray(int[] target, int n) {
3        Stack<String> st = new Stack<>();
4        int curr = 1;
5        for(int n1 : target) {
6            while(curr < n1) {
7                st.push("Push");
8                st.push("Pop");
9                curr++;
10            }
11            st.push("Push");
12            curr++;
13        }
14        return st;
15    }
16}