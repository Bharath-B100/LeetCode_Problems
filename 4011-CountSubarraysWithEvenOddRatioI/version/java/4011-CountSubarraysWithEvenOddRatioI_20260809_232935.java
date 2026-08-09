// Last updated: 8/9/2026, 11:29:35 PM
1class Solution {
2    public int countRatioSubarrays(int[] nums, int a, int b) {
3        int ans = 0;
4		int even = 0;
5		int odd = 0;
6		for(int i=0;i<=nums.length-1;i++) {
7			even = 0;
8			odd = 0;
9			for(int j=i;j<=nums.length-1;j++) {
10				if(nums[j]%2== 0){
11					even++;
12				}
13                else
14                {
15					odd++;
16				}
17				if(odd > 0 && b*even <= a*odd)
18					ans++;
19			}
20		}
21        return ans;
22    }
23}