// Last updated: 7/10/2026, 10:19:57 AM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        String cleaned = s.replace("-","").toUpperCase();
4        StringBuilder sb = new StringBuilder();
5        for(int i=cleaned.length()-1;i>=0;i--){
6            if(sb.length() % (k+1)==k){
7                sb.append('-');
8            }
9            sb.append(cleaned.charAt(i));
10        }
11        return sb.reverse().toString();
12    }
13}