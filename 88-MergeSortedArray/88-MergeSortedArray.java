// Last updated: 8/28/2026, 12:40:58 AM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        for(int j=0;j<n;j++) {
4            nums1[m] = nums2[j];
5            m++;
6        }
7        Arrays.sort(nums1);
8    }
9}