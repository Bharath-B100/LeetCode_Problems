// Last updated: 5/25/2026, 11:14:17 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0, 1);
        int prefixSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            if (h.containsKey(prefixSum - k)) {
                count =count+h.get(prefixSum - k);
            }
            h.put(prefixSum, h.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}
