// Last updated: 6/6/2026, 9:37:24 AM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        ArrayList<Integer> l = new ArrayList<>();
4        for (int i = 1; i <= n; i++) {
5            l.add(i);
6        }
7        int i = 0;
8        while(l.size() != 1) {
9            i = (i + k - 1) % l.size();
10            l.remove(i);
11        }
12        return l.get(0);
13    }
14}