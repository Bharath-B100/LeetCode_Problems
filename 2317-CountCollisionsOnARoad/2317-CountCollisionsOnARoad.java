// Last updated: 5/25/2026, 11:10:45 AM
class Solution {
    public int countCollisions(String D) {
        final int n=D.length();
        if (n==1) return 0;
        int l=0, r=n-1;
        while (l<r && D.charAt(l)=='L') l++;
        while (l<r && D.charAt(r)=='R') r--;
        if (l>=r) return 0;
        int col=0;
        for( ; l<=r; l++){
           col+=(D.charAt(l)!='S'?1:0);
        }
        return col;  
    }
}