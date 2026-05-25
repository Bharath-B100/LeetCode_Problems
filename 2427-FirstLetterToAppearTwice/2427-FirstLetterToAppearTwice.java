// Last updated: 5/25/2026, 11:10:35 AM
class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.add(c))
            {
                return c;  
            }
        }
        return 'a';
    }
}
