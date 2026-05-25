// Last updated: 5/25/2026, 11:13:48 AM
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        
        for (int i=left;i<=right;i++) {
            int setBits=Integer.bitCount(i);
            if (isPrime(setBits)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }
        for (int i=2;i*i <= n;i++) {
            if (n%i==0) {
                return false;
            }
        }
        
        return true;
    }
}