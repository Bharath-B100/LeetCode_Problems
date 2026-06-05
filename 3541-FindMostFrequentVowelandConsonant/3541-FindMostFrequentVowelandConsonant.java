// Last updated: 6/5/2026, 5:12:43 PM
1class Solution {
2    public int maxFreqSum(String s) {
3        int[] freq = new int[26];
4        int maxVowel = 0, maxConso = 0;
5        for (char c : s.toCharArray()) {
6            int i = c - 'a';
7            freq[i]++;
8            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
9                maxVowel = Math.max(maxVowel, freq[i]);
10            else
11                maxConso = Math.max(maxConso, freq[i]);
12        }
13        return maxVowel + maxConso;
14    }
15}