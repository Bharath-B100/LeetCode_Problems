// Last updated: 5/25/2026, 11:16:29 AM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        post(root, result);
        return result;
    } 
    private void post(TreeNode root, List<Integer> result) {
        if (root != null) {
            post(root.left, result);
            post(root.right, result);
            result.add(root.val);
        }
    }
}