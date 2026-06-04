// Last updated: 6/4/2026, 11:58:06 PM
1class Solution {
2    public int minimumSum(int num) {
3        char[] digits = String.valueOf(num).toCharArray();
4        Arrays.sort(digits);
5
6        int left = 0, right = 0;
7
8        for (int i = 0; i < digits.length; i++) {
9            if (i % 2 == 0)
10                right = right * 10 + (digits[i] - '0');
11            else
12                left = left * 10 + (digits[i] - '0');
13        }
14
15        return left + right;
16    }
17}