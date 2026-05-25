// Last updated: 5/25/2026, 11:13:23 AM
class Solution {
    public int repeatedNTimes(int[] nums) {
        Set <Integer> n = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(n.contains(nums[i])){
            return nums[i];
            }
            n.add(nums[i]);
        }
        return 0;
    }
}