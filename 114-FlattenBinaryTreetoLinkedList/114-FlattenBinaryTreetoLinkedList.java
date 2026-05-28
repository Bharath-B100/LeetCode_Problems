// Last updated: 5/28/2026, 7:20:47 PM
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
17    TreeNode curr=null;
18    public void flatten(TreeNode root) {
19        if(root==null)return;
20        flatten(root.right);
21        flatten(root.left);
22
23        root.right=curr;
24        root.left=null;
25        curr=root;        
26    }
27}