// Last updated: 8/9/2026, 2:25:00 PM
1class Solution {
2    public List<Integer> selfDividingNumbers(int left, int right) {
3        List<Integer> res = new ArrayList<>();
4        while(left <= right) 
5        {
6            int copy = left;
7            boolean SelfDiv = true;
8            while(copy!=0) 
9            {
10                int d=copy % 10;
11                copy/=10;
12                if(d==0||left%d!= 0) 
13                {
14                    SelfDiv=false;
15                    break;
16                }
17            }
18            if(SelfDiv)
19                res.add(left);
20            left++;
21        }
22        return res;
23    }
24}