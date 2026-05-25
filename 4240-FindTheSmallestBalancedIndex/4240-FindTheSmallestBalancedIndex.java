// Last updated: 5/25/2026, 11:08:09 AM
class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long lsum = 0;
        for (int x : nums) lsum += x;

        int result = -1;
        long rprod = 1;
        for (int i = nums.length - 1; i >= 0; --i) {
            lsum -= nums[i];  
            if (lsum == rprod)  
                return i;
            if (lsum < rprod) 
                break;

            rprod *= nums[i]; 
        }

        return -1;
    }
}