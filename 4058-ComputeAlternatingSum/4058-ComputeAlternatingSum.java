// Last updated: 6/12/2026, 5:35:24 PM
class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            if(i%2 == 0)sum+=nums[i];
            else sum-=nums[i];
        }

        return sum;
    }
}