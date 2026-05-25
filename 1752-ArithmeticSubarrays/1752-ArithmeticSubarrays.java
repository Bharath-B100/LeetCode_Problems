// Last updated: 5/25/2026, 11:11:54 AM
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < l.length; i++) {
            int[] arr = new int[r[i] - l[i] + 1];
            int z = 0;
            for (int j = l[i]; j <= r[i]; j++) {
                arr[z++] = nums[j];
            }
            Arrays.sort(arr);
            boolean check = true;
            int diff = arr[0] - arr[1];
            for (int j = 1; j < arr.length - 1; j++) {
                int temp = arr[j] - arr[j + 1];
                if (diff != temp) {
                    check = false;
                    break;
                }
            }
            ans.add(check);
        }
        return ans;
    }
}