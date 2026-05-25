// Last updated: 5/25/2026, 11:18:03 AM
class Solution {
    public int removeDuplicates(int[] nums) {
      if(nums.length == 0)
      {
        return 0;
      }
      int res = 1;
      for(int i = 1; i < nums.length; i++){
        if(nums[i] != nums[i - 1]){
        nums[res] = nums[i];
            res++;
        }
      }
      return res;
    }
}