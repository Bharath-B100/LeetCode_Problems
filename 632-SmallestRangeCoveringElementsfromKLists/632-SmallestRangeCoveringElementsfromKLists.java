// Last updated: 5/26/2026, 2:06:41 PM
1import java.util.*;
2
3class Solution {
4    public int[] smallestRange(List<List<Integer>> nums) {
5        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
6        int max = Integer.MIN_VALUE;
7
8        for (int i = 0; i < nums.size(); i++) {
9            int val = nums.get(i).get(0);
10            pq.offer(new int[]{val, i, 0});
11            max = Math.max(max, val);
12        }
13
14        int start = 0, end = Integer.MAX_VALUE;
15
16        while (pq.size() == nums.size()) {
17            int[] curr = pq.poll();
18            int min = curr[0];
19            int row = curr[1];
20            int col = curr[2];
21
22            if (max - min < end - start) {
23                start = min;
24                end = max;
25            }
26
27            if (col + 1 < nums.get(row).size()) {
28                int nextVal = nums.get(row).get(col + 1);
29                pq.offer(new int[]{nextVal, row, col + 1});
30                max = Math.max(max, nextVal);
31            }
32        }
33
34        return new int[]{start, end};
35    }
36}