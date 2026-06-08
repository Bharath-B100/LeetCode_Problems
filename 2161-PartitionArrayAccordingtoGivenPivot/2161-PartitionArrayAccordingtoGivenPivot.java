// Last updated: 6/8/2026, 9:00:43 PM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int[] result = new int[nums.length];
4        int left = 0, right = nums.length - 1;
5        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
6            if (nums[i] < pivot) {
7                result[left] = nums[i];
8                left++;
9            }
10            if (nums[j] > pivot) {
11                result[right] = nums[j];
12                right--;
13            }
14        }
15        while (left <= right) {
16            result[left] = pivot;
17            left++;
18 }
19        return result;
20    }
21}