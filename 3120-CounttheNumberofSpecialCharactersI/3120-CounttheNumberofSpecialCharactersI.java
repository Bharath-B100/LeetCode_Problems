// Last updated: 5/26/2026, 6:52:05 PM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        HashSet<Character> set = new HashSet<>();
4        for(char ch : word.toCharArray()) {
5            set.add(ch);
6        }
7        int count = 0;
8        for(char ch = 'a'; ch <= 'z'; ch++) {
9            if(set.contains(ch) && set.contains((char)(ch - 'a' + 'A'))) {
10                count++;
11            }
12        }
13        return count;
14    }
15}