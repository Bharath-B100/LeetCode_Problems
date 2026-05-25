// Last updated: 5/25/2026, 11:10:14 AM
class Solution {
    public int passThePillow(int n, int time) {
        int a=time%(2*(n-1));
       if(a<n)
       {
        return a+1;
       }
       else
       {
        return 2*n-a-1;
       }
    }
}