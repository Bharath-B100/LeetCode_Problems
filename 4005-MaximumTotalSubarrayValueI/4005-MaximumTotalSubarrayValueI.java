// Last updated: 6/12/2026, 5:35:27 PM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length-1;
        Arrays.sort(nums);
        return (long)k * (nums[n]-nums[0]);
    }
}