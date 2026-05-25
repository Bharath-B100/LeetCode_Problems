// Last updated: 5/25/2026, 11:08:08 AM
class Solution {
    public int countCommas(int n) {
        if(n<999){
            return 0;
        }
        return n-999;
    }
}