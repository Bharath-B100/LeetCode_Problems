// Last updated: 5/25/2026, 11:14:48 AM
class Solution {
    public int maxRotateFunction(int[] A) {
        int sum = 0, F = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            sum += A[i];
            F += i * A[i];
        }
        int max = F;
        for (int i = 1; i < n; i++) {
            F += sum - n * A[n - i];
            max = Math.max(max, F);
        }
        return max;
    }
}