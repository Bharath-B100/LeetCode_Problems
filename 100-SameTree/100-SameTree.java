// Last updated: 5/25/2026, 7:13:21 PM
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3        if(p==null && q==null) return true;
4        if(p==null || q==null) return false;
5        return p.val == q.val && isSameTree(p.left, q.left)&& isSameTree(p.right, q.right);
6
7    }
8}