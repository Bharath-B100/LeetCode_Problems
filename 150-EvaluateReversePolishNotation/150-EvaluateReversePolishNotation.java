// Last updated: 6/22/2026, 10:28:00 AM
1class Solution {
2    public int evalRPN(String[] t) {
3        Stack<Integer> st = new Stack<>();
4        for (String token : t) {
5            if (token.equals("+"))
6            {
7                int num1 = st.pop();
8                int num2 = st.pop();
9                st.push(num2 + num1);
10            }
11            else if (token.equals("-")) {
12                int num1 = st.pop();
13                int num2 = st.pop();
14                st.push(num2 - num1);
15            } 
16            else if (token.equals("*")) {
17                int num1 = st.pop();
18                int num2 = st.pop();
19                st.push(num2 * num1);
20            }
21            else if (token.equals("/")) {
22                int num1 = st.pop();
23                int num2 = st.pop();
24                st.push(num2 / num1);
25
26            } else {
27                st.push(Integer.parseInt(token));
28            }
29        }
30        return st.peek();
31    }
32}