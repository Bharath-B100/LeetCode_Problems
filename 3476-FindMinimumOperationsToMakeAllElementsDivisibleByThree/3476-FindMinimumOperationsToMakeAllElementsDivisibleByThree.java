// Last updated: 5/25/2026, 11:09:17 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (num % 3 != 0)
            res++;
        }
        return res;
    }
}