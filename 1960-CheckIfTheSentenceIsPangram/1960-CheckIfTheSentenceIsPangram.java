// Last updated: 5/25/2026, 11:11:30 AM
class Solution {
    public boolean checkIfPangram(String s) {
        if (s == null || s.length() < 26) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        return map.size() == 26;
    }
}
