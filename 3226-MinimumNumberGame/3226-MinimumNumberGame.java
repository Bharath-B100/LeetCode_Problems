// Last updated: 5/25/2026, 11:09:45 AM
class Solution {
    public int[] numberGame(int[] nums) {
       Arrays.sort(nums); 
       int arr[] = new int[nums.length];

       for(int i=0;i<nums.length;i=i+2){
        int temp = nums[i];
        nums[i]= nums[i+1];
        nums[i+1]= temp;
       }
       return nums;
    }
}