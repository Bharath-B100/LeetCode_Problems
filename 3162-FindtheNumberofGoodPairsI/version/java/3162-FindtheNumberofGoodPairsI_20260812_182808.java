// Last updated: 8/12/2026, 6:28:08 PM
1class Solution {
2    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
3        int count=0;
4        for(int i=0;i<nums1.length;i++){
5            for(int j=0;j<nums2.length;j++){
6                if(nums1[i]%(nums2[j]*k)==0){ 
7                    count++;
8                }
9            }
10        }
11        return count;
12    }
13}