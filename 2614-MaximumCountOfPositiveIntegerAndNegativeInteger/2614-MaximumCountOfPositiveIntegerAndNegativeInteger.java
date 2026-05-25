// Last updated: 5/25/2026, 11:10:18 AM
class Solution {
    public int maximumCount(int[] nums) {
        int pcount = 0,ncount = 0;
        for(int i = 0;i<=nums.length-1;i++)
        {
            if(nums[i]>0)
            {
                pcount++;
            }
            else if(nums[i]<0)
            {
                ncount++;
            }
        }
        if(pcount<ncount)
        {
            return ncount;
        }
        return pcount;
    }
}