// Last updated: 5/25/2026, 11:13:56 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int total=0,leftsum=0,rightsum;
        for(int x: nums){
            total=total+x;

        }
        for(int i=0;i<nums.length;i++){
            rightsum=total-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}