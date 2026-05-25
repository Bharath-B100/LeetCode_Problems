// Last updated: 5/25/2026, 11:10:24 AM
class Solution {
        public int[] findArray(int[] A) {
        for (int i = A.length - 1; i > 0; --i)
            A[i] ^= A[i - 1];
        return A;
    }
}