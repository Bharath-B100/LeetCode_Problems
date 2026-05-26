// Last updated: 5/26/2026, 6:53:05 PM
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
17    private int pre = 0;
18    private int in = 0;
19    public TreeNode buildTree(int[] preorder, int[] inorder) {
20        return build(preorder,inorder,Integer.MIN_VALUE);
21    }
22
23    private TreeNode build(int[] preorder, int[] inorder, int stop) {
24        if(pre>=preorder.length) {
25            return null;
26        }
27
28        if(inorder[in]==stop) {
29            in++;
30            return null;
31        }
32
33        TreeNode root = new TreeNode(preorder[pre++]);
34        root.left = build(preorder,inorder,root.val);
35        root.right = build(preorder,inorder,stop);
36        return root;
37    }
38}