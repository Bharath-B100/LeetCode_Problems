// Last updated: 5/31/2026, 6:41:53 PM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> res = new ArrayList<>();
19        if (root == null) return res;
20
21        Queue<TreeNode> queue = new LinkedList<>();
22        queue.offer(root);
23        int level =0;
24        while (!queue.isEmpty()) {
25            int size = queue.size();
26            List<Integer> currLevel = new ArrayList<>();
27            for (int i = 0; i < size; i++) {
28                TreeNode node = queue.poll();
29                currLevel.add(node.val);
30                if (node.left != null) queue.offer(node.left);
31                if (node.right != null) queue.offer(node.right);
32            }
33            if (level % 2 == 1) {
34                Collections.reverse(currLevel);
35            }
36            res.add(currLevel);
37            level++;
38        }
39        return res;
40    }
41}
42