// Last updated: 5/25/2026, 11:14:50 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int lastIndex = 0;
        for (char ch : s.toCharArray()) {
            int index = t.indexOf(ch, lastIndex);
            if (lastIndex > index) {
                return false;
            }
            lastIndex = index + 1;
            if (index == -1) {
                return false;
            }

        }

        return true;
    }
}