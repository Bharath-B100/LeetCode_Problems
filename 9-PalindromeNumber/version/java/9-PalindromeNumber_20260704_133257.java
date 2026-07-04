// Last updated: 7/4/2026, 1:32:57 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        if (x < 0)return false;
4
5
6        int reverse = 0;
7        int copy = x;
8
9        while (x > 0) {
10            reverse = (reverse*10) + (x%10);
11            x /=10;
12        }
13        return reverse == copy;        
14    }
15}