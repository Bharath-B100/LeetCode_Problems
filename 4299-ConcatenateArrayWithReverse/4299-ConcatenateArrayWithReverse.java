// Last updated: 6/12/2026, 5:35:14 PM
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int arr[]= new int[n*2];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        int idx=n;
        for(int i=n-1;i>=0;i--){
            arr[idx++]=nums[i];
        }
        return arr;
    }
}
