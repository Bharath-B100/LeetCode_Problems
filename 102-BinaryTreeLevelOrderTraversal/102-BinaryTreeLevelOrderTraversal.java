// Last updated: 5/29/2026, 9:44:06 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        if (root == null) return ans;
20        Queue<TreeNode> q = new LinkedList<>();
21        q.add(root);
22        while (!q.isEmpty()) {
23            int size = q.size();             
24            List<Integer> l = new ArrayList<>();
25            for (int i = 0; i < size; i++) {
26                TreeNode node = q.poll();
27                l.add(node.val);
28                if (node.left != null)
29                {
30                 q.add(node.left);
31                }
32                if (node.right != null)
33                {
34                 q.add(node.right);
35                }
36            }
37            ans.add(l);
38        }
39        return ans;
40    }
41}
42