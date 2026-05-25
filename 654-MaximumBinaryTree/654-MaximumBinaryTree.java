// Last updated: 5/25/2026, 11:14:04 AM
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        Deque<TreeNode> mdStack = new ArrayDeque<>();
        for (int num: nums) {
            TreeNode node = new TreeNode(num); 
            while (
                !mdStack.isEmpty() && mdStack.peekLast().val < num
            ) {
                node.left = mdStack.pollLast();
            }
            if (!mdStack.isEmpty()) {
                mdStack.peekLast().right = node;
            }
            mdStack.offerLast(node);
        }
        return mdStack.pollFirst();
    }
}