// Last updated: 5/25/2026, 11:11:24 AM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max= 0,sum=0, l = 0, r = nums.length - 1;
        while(l < r) {
            sum = nums[l]+nums[r];
            max = Math.max(max,sum);
            l++;
            r--;
        }
        return max;
    }
}