// Last updated: 5/25/2026, 11:08:56 AM
class Solution {
    public int countPartitions(int[] A) {
        int total = Arrays.stream(A).sum();
        return (total & 1) == 0 ? A.length - 1 : 0;
    }
}