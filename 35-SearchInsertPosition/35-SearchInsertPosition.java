// Last updated: 6/1/2026, 11:27:33 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int low =0,high=nums.length-1;
4        while(low<=high)
5        {
6            int mid = (high+low)/2;
7            if(nums[mid]==target)
8            {
9                return mid;
10            }
11            else if(target>nums[mid])
12            {
13                low = mid+1;
14            }
15            else
16            {
17                high = mid-1;
18            }
19            // if(flag==0)
20            // {
21            //     return -1;
22            // }
23        }
24        return low;
25    }
26}