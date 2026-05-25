// Last updated: 5/25/2026, 11:14:33 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0; 
        int j = 0; 
        int count = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++; 
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
}
//     Arrays.sort(g);
//     Arrays.sort(s);
//     int i = 0;
//     for(int j=0;i<g.length && j<s.length;j++) {
// 	    if(g[i] <= s[j]) i++; 
//     }
//     return i;
//     }
// }