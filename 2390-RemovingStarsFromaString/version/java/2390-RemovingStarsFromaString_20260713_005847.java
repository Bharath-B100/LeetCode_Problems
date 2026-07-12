// Last updated: 7/13/2026, 12:58:47 AM
1class Solution {
2    public String removeStars(String s) {
3        char ch[] = s.toCharArray();
4        Stack<Character> st = new Stack<>();
5        for(int i=0;i<s.length();i++){
6            if(ch[i]!='*'){
7                st.push(ch[i]);
8            }
9            else{
10                if(!st.isEmpty())
11                st.pop();
12            }
13        }
14        StringBuilder sb = new StringBuilder();
15        for(char c:st){
16            sb.append(c);
17        }
18        return sb.toString();
19    }
20}