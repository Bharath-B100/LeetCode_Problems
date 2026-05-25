// Last updated: 5/25/2026, 11:13:21 AM
class Solution {
    public boolean uni(TreeNode root, int val) {
        if(root ==null )
        {
            return true;
        }
        if(root.val != val){
            return false;
        }
        boolean l = uni(root.left,val); 
        boolean r = uni(root.right,val);
        return(l&&r);
    }
    public boolean isUnivalTree(TreeNode root)
    {
        int val = root.val;
        return uni(root,val);
    }
}