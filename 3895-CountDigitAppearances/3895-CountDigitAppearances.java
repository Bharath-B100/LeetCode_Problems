// Last updated: 6/23/2026, 10:32:39 PM
1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3        int count = 0;
4        for( int num : nums ){
5            if( num == 0 && digit == 0){
6                count++;
7            }
8            while(num > 0){
9                if(num % 10 == digit){
10                    count++;
11                }
12                num = num / 10;
13            }
14        }
15        return count;
16    }
17}