// Last updated: 8/28/2026, 11:59:00 AM
1class Solution {
2    public String shiftingLetters(String s, int[] shifts) {
3        char ch[] = s.toCharArray(); 
4        long count =0;
5        for(int i=s.length()-1;i>=0;i--){
6            count = count + shifts[i];
7            ch[i] = (char) ('a'+(ch[i]-'a' + count)% 26);
8        }
9        return new String(ch);
10    }
11}