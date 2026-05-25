// Last updated: 5/25/2026, 11:08:06 AM
class Solution {
    public boolean uniformArray(int[] nums1) 
    {
        int n = nums1.length;
        int min = Integer.MAX_VALUE;
        int even = 0;
        for(int i=0;i<n;i++)
        {
            min = Math.min(min , nums1[i]);
            if(nums1[i]%2==0){
            even++;
            }
        }
        if(even == n||even==0){
            return true;
        }
        if(min % 2 != 0){
            return true;
        }
        return false;
    }
}