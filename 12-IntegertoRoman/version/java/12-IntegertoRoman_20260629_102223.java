// Last updated: 6/29/2026, 10:22:23 AM
1class Solution {
2    public String intToRoman(int num) {
3        final int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
4        final String[] s = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
5
6        StringBuilder sb = new StringBuilder();
7        for(int i= 0;i<val.length; ++i) {
8            if(num == 0)
9                break;
10            while(num >=val[i]) {
11                sb.append(s[i]);
12                num -= val[i];
13            }
14        }
15        return sb.toString();        
16    }
17}