// Last updated: 5/25/2026, 11:08:12 AM
class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;

        int res = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            int count = i;
            int num = nums[n - 1 - i]; 
            if (num * count > sum) 
                res++;
            sum += num;
        }
        return res;
    }
}