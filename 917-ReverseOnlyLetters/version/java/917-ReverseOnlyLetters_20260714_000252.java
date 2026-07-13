// Last updated: 7/14/2026, 12:02:52 AM
1class Solution {
2    public String removeDuplicates(String s) {
3        Stack<Character> st = new Stack<>();
4        int n = s.length();
5        char ch[] = s.toCharArray();
6        for(int i=0;i<n;i++){
7            if(!st.isEmpty() && st.peek()==ch[i]){
8                st.pop();
9            }
10            else{
11                st.push(ch[i]);
12            }
13        }
14            StringBuilder sb = new StringBuilder();
15            while(!st.isEmpty()){
16                sb.append(st.pop());
17            }
18        return sb.reverse().toString();
19    }
20}
21
22