// Last updated: 7/20/2026, 10:04:25 PM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int rightSum = 0;
4        for(int num : nums) {
5            rightSum += num;
6        }
7        int leftSum = 0;
8        int[] result = new int[nums.length];
9
10        for(int i=0;i<nums.length;i++) {
11            rightSum -= nums[i];
12            result[i] = Math.abs(leftSum-rightSum);
13            leftSum+=nums[i];
14        }
15
16        return result;
17    }
18}