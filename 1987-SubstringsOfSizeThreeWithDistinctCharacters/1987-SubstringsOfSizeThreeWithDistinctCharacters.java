// Last updated: 5/25/2026, 11:11:26 AM
class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int i=0; i<n-2;i++) { 
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i+2);

            if(a != b && a!=c && b!=c)
            {
                count++;
            }
        }
        return count;
    }
}