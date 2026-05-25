// Last updated: 5/25/2026, 11:12:12 AM
class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int count = 0;
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            pre[i+1] = pre[i]^arr[i];
        }
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (pre[i] == pre[j+1]) {
                    count =count+ (j-i);
                }
            }
        }
        return count;
    }
}