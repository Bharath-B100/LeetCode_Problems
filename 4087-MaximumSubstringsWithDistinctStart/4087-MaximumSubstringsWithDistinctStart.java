// Last updated: 5/25/2026, 11:08:24 AM
class Solution {
    public int maxDistinct(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }
}
