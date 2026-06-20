// Last updated: 6/20/2026, 10:18:11 PM
1class Solution {
2    private boolean fulfilled(int[] freq) {
3        boolean fulfilled = true;
4        for(int f: freq) {
5            if(f > 0) fulfilled = false;
6        }
7        return fulfilled;
8    }
9    private int charToIdx(char c) {
10        switch(c) {
11            case 'Q': return 0;
12            case 'W': return 1;
13            case 'E': return 2;
14        }
15        return 3;
16    }
17    
18    public int balancedString(String s) {
19        int N = s.length();
20        int required = N/4;
21       
22        int[] freq = new int[4];
23        for(int i = 0; i < N; ++i) {
24            char c = s.charAt(i);
25            ++freq[charToIdx(c)];
26        }
27    
28        boolean equal = true;
29        for(int i = 0; i < 4; ++i) {
30            if(freq[i] != required) equal = false;
31            freq[i] = Math.max(0, freq[i] - required);
32        }
33        
34        if(equal) return 0; 
35        
36        int start = 0;
37        int minLen = N; 
38        
39        for(int end = 0; end < N; ++end) {
40            char c = s.charAt(end);
41            --freq[charToIdx(c)];
42            
43            while(fulfilled(freq)) {
44                minLen = Math.min(end - start + 1, minLen);
45
46                char st = s.charAt(start);
47                ++freq[charToIdx(st)];
48                ++start;
49            }
50        }
51        
52        return minLen;
53    }
54}