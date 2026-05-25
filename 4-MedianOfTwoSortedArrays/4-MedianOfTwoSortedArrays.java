// Last updated: 5/25/2026, 11:18:29 AM
class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int n = n1.length, m = n2.length;
        int total = n + m;
        int mid1 = (total - 1) / 2;
        int mid2 = total / 2;
        int i = 0, j = 0, count = 0, a = 0, b = 0;
        while (count <= mid2) {
            int val;
            if (i < n && (j >= m || n1[i] < n2[j])) {
                val = n1[i++];
            } else {
                val = n2[j++];
            }
            if (count == mid1) a = val;
            if (count == mid2) b = val;
            count++;
        }
        return (a + b) / 2.0;
    }
}