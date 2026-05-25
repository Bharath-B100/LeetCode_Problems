// Last updated: 5/25/2026, 11:14:53 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] charsCounter = new int[26];
        for (char ch : magazine.toCharArray()) {
            charsCounter[ch - 'a']++; 
        }
        for (char ch : ransomNote.toCharArray()) {
            int charCount = charsCounter[ch - 'a'];
            if (charCount <= 0) return false;

            charsCounter[ch - 'a']--; 
        }

        return true;
    }
}