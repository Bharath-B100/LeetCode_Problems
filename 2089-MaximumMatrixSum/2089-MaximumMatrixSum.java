// Last updated: 5/25/2026, 11:11:11 AM
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int negativeCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int val = matrix[i][j];
                if (val < 0) negativeCount++;
                int absVal = Math.abs(val);
                sum += absVal;
                min = Math.min(min, absVal);
            }
        }
        if (negativeCount % 2 ==1) {
            sum =sum-2L*min;
        }
        return sum;
    }
}
