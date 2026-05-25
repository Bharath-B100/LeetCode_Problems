// Last updated: 5/25/2026, 11:11:16 AM
class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) s = s.replaceFirst(part, "");
        return s;
    }
}