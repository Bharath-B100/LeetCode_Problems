// Last updated: 5/25/2026, 11:12:33 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length;i++) {
            String s = Integer.toString(nums[i]);
            if(s.length()%2==0){
                count++;
            }
        }
        return count;
    }
}