// Last updated: 5/25/2026, 11:16:16 AM
class Solution {
    public int[] twoSum(int[] nums, int targ) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high){
            if (nums[low] + nums[high] == targ) return new int [] {low+1, high+1};
            else if (nums[low] + nums[high] < targ) low++;
            else high--;
        }

        return null;
    }
}