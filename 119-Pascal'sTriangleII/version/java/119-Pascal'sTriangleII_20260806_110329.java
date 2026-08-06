// Last updated: 8/6/2026, 11:03:29 AM
1class Solution {
2    public List<Integer> getRow(int n) {
3        List<Integer> l = new ArrayList<>();
4        l.add(1);
5        for(int i=0;i<n;i++){
6            List <Integer> row = new ArrayList<>();
7            row.add(1);
8            for(int j=1;j<l.size();j++){
9                row.add(l.get(j-1)+l.get(j));
10            }
11            row.add(1);
12            l = row;
13        }
14        return l;
15    }
16}