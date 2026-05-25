// Last updated: 5/25/2026, 11:13:02 AM
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] diff = new int[1001];

        for (int[] c : trips) {
            int persons = c[0];
            int from = c[1];
            int to = c[2];
            diff[from] += persons;
            diff[to] -= persons; 
        }
        int sum = 0;
        for (int i = 0; i < diff.length; i++) {
            sum += diff[i];
            if (sum > capacity) {
                return false;
            }
        }

        return true;
    }
}
