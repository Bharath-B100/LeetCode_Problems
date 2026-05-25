// Last updated: 5/25/2026, 11:09:39 AM
class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        int[] horizontal = new int[hFences.length + 2];
        int[] vertical = new int[vFences.length + 2];

        int idx = 0;
        for (int x : hFences) horizontal[idx++] = x;
        horizontal[idx++] = 1;
        horizontal[idx] = m;

        idx = 0;
        for (int x : vFences) vertical[idx++] = x;
        vertical[idx++] = 1;
        vertical[idx] = n;

        Arrays.sort(horizontal);
        Arrays.sort(vertical);
        Set<Integer> possibleHeights = new HashSet<>();
        for (int i = 0; i < horizontal.length; i++) {
            for (int j = i + 1; j < horizontal.length; j++) {
                possibleHeights.add(horizontal[j] - horizontal[i]);
            }
        }
        long largestSide = -1;
        for (int i = 0; i < vertical.length; i++) {
            for (int j = i + 1; j < vertical.length; j++) {
                int width = vertical[j] - vertical[i];
                if (possibleHeights.contains(width)) {
                    largestSide = Math.max(largestSide, width);
                }
            }
        }
        if (largestSide == -1) return -1;

        long MOD = 1_000_000_007;
        return (int) ((largestSide * largestSide)%MOD);
    }
}
