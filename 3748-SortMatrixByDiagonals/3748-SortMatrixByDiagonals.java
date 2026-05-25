// Last updated: 5/25/2026, 11:08:55 AM
class Solution {
    public int[][] sortMatrix(int[][] grid) {

        int n = grid.length;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(grid[i][i]);
        }

        Collections.sort(arr);
        Collections.reverse(arr);

        for (int i = 0; i < n; i++) {
            grid[i][i] = arr.get(i);
        }
        for (int k = 1; k < n; k++) {

            ArrayList<Integer> list = new ArrayList<>();

            int i = k, j = 0;

            while (i < n && j < n) {
                list.add(grid[i][j]);
                i++;
                j++;
            }

            Collections.sort(list);
            Collections.reverse(list);

            i = k;
            j = 0;
            int ind = 0;

            while (i < n && j < n) {
                grid[i][j] = list.get(ind++);
                i++;
                j++;
            }
        }
        for (int k = 1; k < n; k++) {

            ArrayList<Integer> list = new ArrayList<>();

            int i = 0, j = k;

            while (i < n && j < n) {
                list.add(grid[i][j]);
                i++;
                j++;
            }

            Collections.sort(list);

            i = 0;
            j = k;
            int ind = 0;

            while (i < n && j < n) {
                grid[i][j] = list.get(ind++);
                i++;
                j++;
            }
        }

        return grid;
    }
}