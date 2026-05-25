// Last updated: 5/25/2026, 11:14:12 AM
class Solution {
    public int findLHS(int[] nums) {
       int left =0,right=1,len,max=0;
       Arrays.sort(nums);
       for(right=1;right<nums.length;right++)
       {
       if(nums[right]-nums[left]==1)
       {
        len = right - left+1;
        if(len>max)
        {
         max=len;  
        }
       }
        while((nums[right]-nums[left])>1 && left<right )
        {
            left++;
        }
       } 
       return max; 
    }
}