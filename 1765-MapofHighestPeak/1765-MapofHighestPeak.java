// Last updated: 6/18/2026, 10:29:00 AM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        ArrayList<Integer> list= new ArrayList<>();
4        int n = matrix.length;
5        int m = matrix[0].length;
6        int left = 0;
7        int right = m-1;
8        int top = 0;
9        int bottom = n-1;
10        while( top<=bottom && left<= right){
11            for(int i=left;i<=right;i++){
12                list.add(matrix[top][i]);
13            }
14            top++;
15            for(int i=top;i<=bottom;i++){
16                list.add(matrix[i][right]);
17            }
18            right--;
19            if(top<=bottom)
20            {
21            for(int i=right;i>=left;i--){
22                list.add(matrix[bottom][i]);
23            }
24            bottom--;
25            }
26            if(left<=right){
27            for(int i=bottom;i>=top;i--){
28                list.add(matrix[i][left]);
29            }
30            left++;
31            }
32        }
33        return list;
34    }
35}