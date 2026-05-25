// Last updated: 5/25/2026, 11:08:39 AM
class Solution {
    public int maxProduct(int n) {
      int a = 0,b = 0;
      while(n > 0){
        int m = n%10;
        if(m >a){
            b=a;
            a= m;}
            else if(m>b){
                b = m;
            } 
            n/= 10;
      }return a*b; 
    }
}