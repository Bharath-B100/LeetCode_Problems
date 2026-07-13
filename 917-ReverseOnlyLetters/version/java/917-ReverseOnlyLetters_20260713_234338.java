// Last updated: 7/13/2026, 11:43:38 PM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        int n = s.length();
4        int left =0;
5        int right = n-1;
6        char ch[] = s.toCharArray();
7        while(left<right){
8            if(!Character.isLetter(ch[left])){
9                left++;
10            }
11            else if(!Character.isLetter(ch[right])){
12                right--;
13            }
14            else{
15                char temp = ch[left];
16                ch[left] = ch[right];
17                ch[right] = temp;
18                left++;
19                right--;
20            }
21        }
22        return new String(ch);
23    }
24}