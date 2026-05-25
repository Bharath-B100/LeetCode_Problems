// Last updated: 5/25/2026, 11:15:03 AM
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
    public int rob(TreeNode root) {
        int[] dp=dfs(root);
        return Math.max(dp[0],dp[1]);
    }
    static int[] dfs(TreeNode root)
    {
        if(root==null)
        {
            return new int[2];
        }
        int[] left =dfs(root.left);
        int[] right=dfs(root.right);
        int dp[]=new int[2];
        dp[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        dp[1]=root.val+left[0]+right[0];
        return dp;
    } 
}