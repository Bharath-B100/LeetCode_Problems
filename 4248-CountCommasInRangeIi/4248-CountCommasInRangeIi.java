// Last updated: 5/25/2026, 11:08:01 AM
class Solution {
    public long countCommas(long n) {
        long commas = 0;
        long t  = 1000;
        while(n >= t)
        {
            commas = commas + n-t+1;
            t = t * 1000;
        }
        return commas;
    }
}