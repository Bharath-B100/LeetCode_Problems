// Last updated: 7/29/2026, 7:49:03 AM
1class Solution {
2    public String smallestPalindrome(String s) {
3        int n = s.length();
4        StringBuilder firstHalf = new StringBuilder();
5        for(int i=0;i< n/2;i++) {
6            firstHalf.append(s.charAt(i));
7        }
8        char[] arr = firstHalf.toString().toCharArray();
9        Arrays.sort(arr);
10
11        StringBuilder left = new StringBuilder();
12        for(char ch : arr) {
13            left.append(ch);
14        }
15
16        StringBuilder ans = new StringBuilder();
17        ans.append(left);
18
19        if(n % 2 == 1) {
20            ans.append(s.charAt(n/2));
21        }
22        ans.append(new StringBuilder(left).reverse());
23
24        return ans.toString();
25    }
26}