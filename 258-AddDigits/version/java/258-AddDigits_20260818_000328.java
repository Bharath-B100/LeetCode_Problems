// Last updated: 8/18/2026, 12:03:28 AM
1class Solution {
2    public int addDigits(int num) {
3        int sum = 0,ld;
4        if( num < 10)
5        {
6            return num;
7        }
8        while(num>=10)
9        {
10            sum=0;
11            while(num > 0){
12                ld = num % 10;
13                num = num/10;
14                sum = sum+ld;
15            }
16            num = sum;
17        }
18        return sum;
19    }
20}