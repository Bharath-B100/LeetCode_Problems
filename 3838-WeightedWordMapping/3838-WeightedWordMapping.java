// Last updated: 6/13/2026, 6:18:59 PM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder result = new StringBuilder();
4        for (String word : words) {
5            int sumWeight = 0;
6            for (char ch : word.toCharArray()) {
7                sumWeight += weights[ch - 'a'];
8            }
9
10            int value = sumWeight % 26;
11            result.append((char) ('z' - value));
12        }
13        return result.toString();
14    }
15}