// Last updated: 5/25/2026, 11:15:22 AM
class Solution {
    public int addDigits(int num) {
        int sum = 0,ld;
        if( num < 10)
        {
            return num;
        }
        while(num>=10)
        {
            sum=0;
            while(num > 0){
                ld = num % 10;
                num = num/10;
                sum = sum+ld;
            }
            num = sum;
        }
        return sum;
    }
}