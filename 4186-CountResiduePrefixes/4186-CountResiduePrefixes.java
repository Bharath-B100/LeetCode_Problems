// Last updated: 5/25/2026, 11:08:14 AM
class Solution {
    public int residuePrefixes(String s) {
        boolean[] see = new boolean[26];
        int dis =0;
        int count=0;

        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i)-'a';

            if(!see[idx]){
                see[idx]=true;
                dis++;
            }
            int l = i+1;
            if(dis==l%3){
                count++;
            }
        }
        return count;
    }
}