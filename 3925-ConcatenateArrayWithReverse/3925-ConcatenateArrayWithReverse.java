// Last updated: 6/10/2026, 10:26:22 PM
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int n = nums.length;
4        int arr[]= new int[n*2];
5        for(int i=0;i<n;i++){
6            arr[i]=nums[i];
7        }
8        int idx=n;
9        for(int i=n-1;i>=0;i--){
10            arr[idx++]=nums[i];
11        }
12        return arr;
13    }
14}
15