// Last updated: 6/16/2026, 5:49:21 PM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        int maxArea = 0;
4        int w =0;
5        int n = heights.length;
6        Stack <Integer> st = new Stack<>();
7        for(int i=0;i<=n;i++)
8        {
9            while(!st.isEmpty() && ((i==n) || heights[st.peek()]>heights[i]))
10            {
11                int h = heights[st.pop()]; 
12                if(st.isEmpty())
13                {
14                    w = i;
15                }
16                else{
17                    w = i-st.peek()-1;
18                }
19                maxArea = Math.max(maxArea,h*w);
20            }
21            st.push(i);
22        }
23        return maxArea;
24    }
25}
26