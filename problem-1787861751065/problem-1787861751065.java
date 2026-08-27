// Last updated: 8/28/2026, 1:45:51 AM
1public class Solution {
2    public boolean checkValidString(String s) {
3        Stack<Integer> open = new Stack<>();
4        Stack<Integer> star = new Stack<>();
5
6        for(int i=0;i<s.length();i++) { 
7            char c = s.charAt(i);
8            if(c == '(') {
9                open.push(i);
10            }
11            else if(c == '*') {
12                star.push(i);
13            }
14            else{ 
15                if(!open.isEmpty()) {
16                    open.pop();
17                }
18                else if(!star.isEmpty()) {
19                    star.pop();
20                }
21                else{
22                    return false;
23                }
24            }
25        }
26        while(!open.isEmpty() && !star.isEmpty()) {
27            int openIdx = open.pop();
28            int starIdx = star.pop();
29            if(starIdx < openIdx) {
30                return false;
31            }
32        }
33        return open.isEmpty();
34    }
35}