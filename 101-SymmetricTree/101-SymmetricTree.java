// Last updated: 5/25/2026, 7:15:06 PM
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
17    public boolean isSymmetric(TreeNode root) {
18        if(root==null)return true;
19        return isMirror(root.left,root.right);
20    }
21    private boolean isMirror(TreeNode p,TreeNode q){
22        if(p==null&&q==null) return true;
23        if(p==null||q==null) return false;
24        if(p.val!=q.val) return false; 
25
26        return isMirror(p.left,q.right) && isMirror(p.right,q.left);
27    }
28}