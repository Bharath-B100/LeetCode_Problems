// Last updated: 8/10/2026, 1:42:35 PM
1class Solution {
2    public boolean checkRecord(String s) {
3        int p=0,a=0,l=0;
4        for(char c:s.toCharArray()){
5            if(c=='P'){
6                p++;
7            }
8            else if(c=='A'){
9                a++;
10            }
11            else if(c=='L'){
12                l++;
13            }
14        }
15        if(s.contains("LLL")){
16            return false;
17        }
18        if(a<2){
19            return true;
20        }
21        return false;
22    }
23}