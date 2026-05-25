// Last updated: 5/25/2026, 11:13:35 AM
class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        List<int[]> la = new ArrayList<>(), lb = new ArrayList<>();
        for (int r = 0; r<rows; r++)
            for (int c = 0; c<cols; c++){
                if (A[r][c] == 1) la.add(new int[]{r,c});
                if (B[r][c] == 1) lb.add(new int[]{r,c});
            }
        Map<String, Integer> map = new HashMap<>();
        for (int[] pa : la)
            for (int[] pb : lb) {
                String s = (pa[0] - pb[0]) + " " + (pa[1]-pb[1]);
                map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int max = 0;
        for (int count : map.values())
            max = Math.max(max, count);
        return max;
    }
}