// Last updated: 5/25/2026, 11:11:09 AM
class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = nums[k - 1] - nums[0];
        for (int i = 0; i + k <= n; i++) {
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        }
        return ans;
    }
}