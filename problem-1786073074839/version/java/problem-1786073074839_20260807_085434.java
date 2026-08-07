// Last updated: 8/7/2026, 8:54:34 AM
1class Solution {
2    public boolean checkValidString(String s) {
3        int low =0;
4        int high =0;
5
6        for(char ch: s.toCharArray()){
7            if(ch=='('){
8                low++;
9                high++;
10            }
11            else if(ch==')'){
12                if(low>0){
13                    low--;
14                }
15                    high--;
16            }
17            else{
18                if(low>0){
19                    low--;
20                }
21                    high++;
22            }
23            if(high<0){
24                return false;
25            }
26        }
27        return low==0;
28    }
29}