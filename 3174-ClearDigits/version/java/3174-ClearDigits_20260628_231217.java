// Last updated: 6/28/2026, 11:12:17 PM
1class Solution {
2    public String clearDigits(String s) {
3        Stack<Character> st = new Stack<>();
4
5        for(char ch : s.toCharArray()){
6            if (Character.isLetter(ch))
7            {
8                st.push(ch);
9            }
10            else if (Character.isDigit(ch)){
11                if (!st.isEmpty() && Character.isLetter(st.peek())) {
12                    st.pop();   
13                }
14                else
15                {
16                    st.push(ch);
17                }
18            }
19        }
20        StringBuilder ans = new StringBuilder();
21        for(int i=0;i<st.size();i++)
22        {
23            ans.append(st.get(i));
24        }
25        return ans.toString();
26    }
27}