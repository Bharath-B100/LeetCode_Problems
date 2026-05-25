// Last updated: 5/25/2026, 11:17:52 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low =0,high=nums.length-1;

        while(low<=high)
        {
            int mid = (high+low)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                low = mid+1;
            }
            else 
            {
                high = mid-1;
            }
            // if(flag==0)
            // {
            //     return -1;
            // }
        }
        return low;
    }
}