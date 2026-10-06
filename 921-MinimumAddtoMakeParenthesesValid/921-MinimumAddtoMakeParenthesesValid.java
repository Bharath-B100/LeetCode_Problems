// Last updated: 10/6/2026, 9:21:35 AM
1class Solution {
2    public int minAddToMakeValid(String s) {
3        int count=0,not=0;
4        for(int i=0;i<s.length();i++) {
5            if(s.charAt(i)=='(')
6                count++;
7            else{
8                if(count>0)
9                    count--;
10                else
11                    not++;
12            }
13        }
14        return count+not;
15    }
16}