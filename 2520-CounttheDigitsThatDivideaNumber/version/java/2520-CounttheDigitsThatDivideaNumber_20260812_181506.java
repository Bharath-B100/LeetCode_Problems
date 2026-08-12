// Last updated: 8/12/2026, 6:15:06 PM
1class Solution {
2    public int countDigits(int num) {
3        int n = num, r, s = 0;
4        while(num != 0){
5            r=num%10;
6            if(n%r==0) {
7                s+=1;
8            }
9            num=num/10;
10        }
11        return s;
12    }
13}