// Last updated: 5/25/2026, 11:13:25 AM
class Solution {
    public int minAddToMakeValid(String s) {
        int count=0, not=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(') count++;
        else{
            if(count>0) count--;
            else
            not++;
            }
        }
        return count+not;
    }
}