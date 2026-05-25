// Last updated: 5/25/2026, 11:12:20 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j] && j != i){
                    count++;
                }
            }
            res[i]=count;
        }
        return res;
    }
}