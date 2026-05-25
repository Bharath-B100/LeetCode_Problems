// Last updated: 5/25/2026, 11:13:20 AM
class Solution {
    public int fib(int n) {
         if(n==1 || n==0)
         {
            return n;
         }
        int a = 0, b = 1;
        for (int i = 1; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
