// Last updated: 8/30/2026, 2:00:20 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> l = new HashMap<>();
4        for(String word : strs) {
5            char[] chars = word.toCharArray();
6            Arrays.sort(chars);
7            String w = new String(chars);
8            
9            if(!l.containsKey(w)) {
10                l.put(w, new ArrayList<>());
11            }
12            l.get(w).add(word);
13        }
14        return new ArrayList<>(l.values());
15    }
16}