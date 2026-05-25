// Last updated: 5/25/2026, 11:14:27 AM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int res[] = new int[m*n];
        int r=0,c=0;
        for(int i=0;i< m*n ;i++){
            res[i] = mat[r][c];

        if((r+c)%2==0){ // up right
            if(c==n-1){ // end col
                r++;
            }
            else if(r==0){ // 1st row ,col shift 
                c++;
            }
            else { // up right poga
                r--;
                c++;
            }
        }
        else{
            if(r==m-1){ 
                c++;
            }
            else if(c==0){
                r++;
            }
            else{
                r++;
                c--; }
            }
        }
        return res;
    }
}