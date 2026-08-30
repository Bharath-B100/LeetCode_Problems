// Last updated: 8/30/2026, 11:21:57 PM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        Map<Integer, Integer> mp = new HashMap<>();
4        int n = nums.length;
5        mp.put(nums[0], 1);
6        for(int i = 1; i < n; i++){
7            if(nums[i] != nums[i - 1]){
8                mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
9            }
10        }
11        int cnt = 0;
12        for(Map.Entry<Integer, Integer> p : mp.entrySet()){
13            if(p.getValue() == 1){
14                cnt++;
15            }
16        }
17        return cnt;
18    }
19}