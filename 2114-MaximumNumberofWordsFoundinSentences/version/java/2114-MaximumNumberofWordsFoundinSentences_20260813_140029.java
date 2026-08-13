// Last updated: 8/13/2026, 2:00:29 PM
1class Solution {
2    public int mostWordsFound(String[] sentences) {
3        int max =0;
4        for(String word:sentences){
5            int curr = word.split(" ").length;
6            max = Math.max(max,curr);
7        }
8        return max;
9    }
10}
11