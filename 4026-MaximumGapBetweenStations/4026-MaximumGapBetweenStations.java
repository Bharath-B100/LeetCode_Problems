// Last updated: 8/22/2026, 1:40:49 PM
1class Solution {
2    public int maximumGap(String skill, String station) {
3        int f[] = new int[skill.length()];
4        int l[] = new int[skill.length()];
5        int idx=0;
6        for(int i=0;i<skill.length();i++){
7            while(idx<station.length()){
8                if(skill.charAt(i)==station.charAt(idx)){
9                    f[i] = idx;
10                    idx++;
11                    break;
12                }
13                idx++;
14            }
15        }
16        int ind = station.length()-1;
17        for(int i=skill.length()-1;i>=0;i--){
18            while(ind>=0){
19                if(skill.charAt(i)==station.charAt(ind)){
20                    l[i] = ind;
21                    ind--;
22                    break;
23                }
24                ind--;
25            }
26        }
27        int max = 0;
28        for(int i=0;i<skill.length()-1;i++){
29            int gap = l[i+1] - f[i];
30            max = Math.max(max,gap);
31        }
32        return max;
33    }
34}