// Last updated: 5/25/2026, 11:08:43 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        return sum%k;
    }
}