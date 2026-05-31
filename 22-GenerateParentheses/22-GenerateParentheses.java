// Last updated: 5/31/2026, 6:39:25 PM
1class Solution {   
2    public List<String> generateParenthesis(int n) {
3        List<String> res = new ArrayList<>();
4        backtrack(res,"",0,0,n);
5        return res;
6    }
7    private void backtrack(List<String> res, String current,int open,int close,int n){
8        if(current.length() == 2*n){
9            res.add(current);
10            return;
11        }
12        if(open < n){
13            backtrack(res, current + "(" , open +1 ,close, n);
14        }
15        if(close < open){
16            backtrack(res, current + ")" , open, close+1,n);
17        }
18    }
19}