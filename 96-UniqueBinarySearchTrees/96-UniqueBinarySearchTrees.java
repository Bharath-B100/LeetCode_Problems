// Last updated: 6/8/2026, 9:30:50 PM
1class Solution {
2    public int numIdenticalPairs(int[] guestList) {
3        HashMap<Integer, Integer> hm = new HashMap<>();
4        int ans = 0;
5        for(int friend:guestList)
6        {
7            int friendCount = hm.getOrDefault(friend,0);
8            ans+=friendCount;
9            hm.put(friend,friendCount+1);
10        }
11        return ans;
12    }
13}