// Last updated: 5/25/2026, 11:08:15 AM
class Solution {
    public String largestEven(String s) {
        int l=-1;
        for(int i=s.length()-1;i>=0;i--){
            int d = s.charAt(i)-'0';
            if(d%2==0){
                l=i;
                break;
            }
        }
        if(l==-1){
            return "";
        }
        return s.substring(0,l+1);
    }
}