// Last updated: 8/12/2026, 2:23:10 PM
1class Solution {
2    public String largestOddNumber(String num) {
3        for(int i = num.length()-1;i>=0;i--) {
4            if((num.charAt(i)-'0')%2==1) {
5                return num.substring(0, i+1);
6            }
7        }
8        return "";
9    }
10}