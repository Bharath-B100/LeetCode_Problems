// Last updated: 7/22/2026, 10:35:23 AM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int row = matrix.length-1;
4        int col = matrix[0].length;
5
6        ArrayList<Integer> list = new ArrayList<>();
7        for(int i=0;i<col;i++){
8            int k = row;
9            while(k>=0){
10                list.add(matrix[k--][i]);
11            }
12        }
13        int ind = 0;
14        for(int i=0;i<=row;i++){
15            for(int j=0;j<col;j++){
16                matrix[i][j] = list.get(ind++);
17            }
18        }
19    }
20}