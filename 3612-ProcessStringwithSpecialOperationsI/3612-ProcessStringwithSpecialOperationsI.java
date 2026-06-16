// Last updated: 6/16/2026, 9:17:41 AM
1class Solution {
2    public String processStr(String s) {
3        int n = s.length();
4        StringBuilder sb = new StringBuilder();
5
6        for(int i=0;i<s.length();i++){
7            char ch = s.charAt(i);
8
9            if(ch=='*'){
10                if(sb.length()!=0){
11                    sb.deleteCharAt(sb.length()-1);
12                }
13            }
14            else if(ch=='#'){
15                sb.append(sb);
16            }
17            else if(ch =='%'){
18                sb.reverse();
19            }
20            else if(ch >= 'a' && ch<= 'z'){
21                sb.append(ch);
22            }
23        }
24        return sb.toString();
25    }
26}