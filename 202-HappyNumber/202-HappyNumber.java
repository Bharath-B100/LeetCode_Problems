// Last updated: 5/25/2026, 11:15:58 AM
public class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) { 
            int sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
