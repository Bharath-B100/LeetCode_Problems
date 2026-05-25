// Last updated: 5/25/2026, 11:12:39 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, pro= 1;
        while (n > 0) {
            int a = n % 10;
            sum = sum+a;
            pro= pro*a;
            n= n/10;
        }
        int ans = pro-sum;
        return ans;
    }
}