// Last updated: 7/7/2026, 1:47:31 PM
1class Solution {
2    public long sumAndMultiply(int n) {
3        if (n == 0) return 0;
4        int temp = n;
5        int count = 0;
6        while (temp > 0) {
7            if (temp % 10 != 0) count++;
8            temp /= 10;
9        }
10        int[] x = new int[count];
11        temp = n;
12        for (int i = count - 1; i >= 0; ) {
13            int digit = temp % 10;
14            if (digit != 0) {
15                x[i] = digit;
16                i--;
17            }
18            temp /= 10;
19        }
20        long sum = 0;
21        long number = 0;
22
23        for (int digit : x) {
24            sum += digit;
25            number = number * 10 + digit;
26        }
27        return sum * number;
28    }
29}