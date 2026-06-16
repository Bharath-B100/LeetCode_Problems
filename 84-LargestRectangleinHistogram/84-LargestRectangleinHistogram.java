// Last updated: 6/17/2026, 12:47:36 AM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> nums = new Stack<>();
4        Stack<StringBuilder> strs = new Stack<>();
5
6        int num = 0;
7        StringBuilder curr = new StringBuilder();
8
9        for (char c : s.toCharArray()) {
10            if (Character.isDigit(c)) {
11                num = num * 10 + (c - '0');
12            } else if (c == '[') {
13                nums.push(num);
14                strs.push(curr);
15                num = 0;
16                curr = new StringBuilder();
17            } else if (c == ']') {
18                StringBuilder temp = strs.pop();
19                int repeat = nums.pop();
20
21                while (repeat > 0) {
22                    repeat--;
23                    temp.append(curr);
24                }
25
26                curr = temp;
27            } else {
28                curr.append(c);
29            }
30        }
31
32        return curr.toString();
33    }
34}
35