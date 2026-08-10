// Last updated: 8/10/2026, 1:51:50 PM
1class Solution {
2    public boolean checkRecord(String s) {
3        int p=0,a=0,l=0;
4        for(char c:s.toCharArray()){
5            if(c=='A'){
6                a++;
7            }
8        }
9        if(s.contains("LLL")){
10            return false;
11        }
12        if(a<2){
13            return true;
14        }
15        return false;
16    }
17}