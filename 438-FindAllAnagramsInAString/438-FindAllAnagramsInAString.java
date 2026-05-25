// Last updated: 5/25/2026, 11:14:38 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), k = p.length();
        if (k > n)
            return new ArrayList<>();
        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char ch : p.toCharArray()) {
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }
        for (int i = n - 1; i > n - k; i--) {
            window.put(s.charAt(i), window.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Integer> ans = new LinkedList<>();
        for (int i = n - k; i >= 0; i--) {
            char ch = s.charAt(i);
            window.put(ch, window.getOrDefault(ch, 0) + 1);
            if (window.equals(pMap))
                ans.addFirst(i);
            ch = s.charAt(i + k - 1);
            int f = window.get(ch);
            if (f > 1)
                window.put(ch, f - 1);
            else
                window.remove(ch);
        }
        return ans;
    }
}