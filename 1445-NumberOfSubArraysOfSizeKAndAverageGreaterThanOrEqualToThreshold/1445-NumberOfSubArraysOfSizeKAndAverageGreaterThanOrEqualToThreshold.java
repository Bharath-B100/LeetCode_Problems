// Last updated: 5/25/2026, 11:12:27 AM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        int count=0;
        int target = threshold * k;
        if (sum>= target) {
            count++;
        }
        for (int i=1; i<= n-k; i++) {
            sum = sum-arr[i - 1]+arr[i+k -1];
            if (sum >= target) {
                count++;
            }
        }
        return count;
    }
}
