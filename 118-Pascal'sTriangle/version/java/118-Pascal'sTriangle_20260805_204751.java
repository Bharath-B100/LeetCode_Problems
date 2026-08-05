// Last updated: 8/5/2026, 8:47:51 PM
1class Solution {
2    public List<List<Integer>> generate(int n) {
3        List <List<Integer>> l = new ArrayList<>();
4        for(int i=0;i<n;i++){
5        List <Integer> r = new ArrayList<>();
6            int num =1; 
7            for(int j=0;j<=i;j++){
8                r.add(num);
9                num = num*(i-j)/(j+1);
10            }
11            l.add(r);
12        }
13        return l;
14    }
15} 