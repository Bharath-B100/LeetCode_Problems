// Last updated: 5/25/2026, 11:14:45 AM
class Solution 
{
    public int count(int[] nums,int mid)
    {
        int ans=1;
        int cnt=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]+cnt>mid)
            {
                ans++;
                cnt=nums[i];
            }
            else
            {
                cnt+=nums[i];
            }
        }
        return ans;
    }
    public int splitArray(int[] nums, int k) 
    {
        int l=0;
        int r=0;
        for(int i=0;i<nums.length;i++)
        {
            l=Math.max(l,nums[i]);
            r+=nums[i];
        }
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int x=count(nums,mid);
            if(x>k)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return l;
    }
}