// Last updated: 5/25/2026, 11:11:20 AM
class Solution {
    public boolean canReach(String s, int minjump, int maxjump) {
        int n = s.length();
        boolean dp[]=new boolean[n];
        dp[0] = true;
        int j=0;
        for(int i=1;i<n;i++){
            if(i-minjump>=0 && dp[i-minjump]){
                j++;
            }
            if(i-maxjump-1>=0 && dp[i-maxjump-1]){
                j--;
            }
            if(s.charAt(i)=='0' && j>0){
                dp[i]=true;
            }
        }
        return dp[n-1];
    }
}