// Last updated: 5/25/2026, 11:14:31 AM
import java.util.*;
class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for (int m : matchsticks) {
            sum += m;
        }
        if (sum % 4 != 0) {
            return false;
        }
        int target = sum / 4;
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        int[] sides = new int[4];
        return backtracking(matchsticks, 0, sides, target);
    }
    private boolean backtracking(int[] nums, int index, int[] sides, int target) {
        if (index == nums.length) {
            return true;
        }
        int num = nums[index];
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] + num > target) {
                continue;
            }
            sides[i] += num;
            if (backtracking(nums, index + 1, sides, target)) {
                return true;
            }
            sides[i] -= num;
            if (sides[i] == 0) {
                break;
            }
        }
        return false;
    }
    private void reverse(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}