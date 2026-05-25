// Last updated: 5/25/2026, 11:17:01 AM
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return p.val == q.val && isSameTree(p.left, q.left)&& isSameTree(p.right, q.right);

    }
}