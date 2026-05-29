// Last updated: 5/29/2026, 6:11:52 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int count = 0;
18    TreeNode result = null;
19
20    public int kthSmallest(TreeNode root, int k) {
21        helper(root, k);
22        return result.val;
23    }
24
25    private void helper(TreeNode node, int k) {
26        if (node == null) return;
27
28        helper(node.left, k);       
29        count++;                    
30        if (count == k) {
31            result = node;
32            return;
33        }
34        helper(node.right, k);     
35    }
36}