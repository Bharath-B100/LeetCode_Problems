// Last updated: 5/25/2026, 11:17:03 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode prev;
    TreeNode first;
    TreeNode second;

    public void recoverTree(TreeNode root) {
        recoverBSTTree(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    void recoverBSTTree(TreeNode root){
                if(root == null) return;

        recoverBSTTree(root.left);

        if(prev != null && prev.val > root.val){
            if(first == null){
                first = prev;
            }
            second = root;
        }
        prev = root;
        recoverBSTTree(root.right);
    }
}