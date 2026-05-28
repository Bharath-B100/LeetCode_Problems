// Last updated: 5/28/2026, 7:22:29 PM
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
16/**
17 * Definition for a binary tree node.
18 * public class TreeNode {
19 *     int val;
20 *     TreeNode left;
21 *     TreeNode right;
22 *     TreeNode() {}
23 *     TreeNode(int val) { this.val = val; }
24 *     TreeNode(int val, TreeNode left, TreeNode right) {
25 *         this.val = val;
26 *         this.left = left;
27 *         this.right = right;
28 *     }
29 * }
30 */
31class Solution {
32
33    private void traverse(TreeNode root, int h, List<Integer> l) {
34        if (root == null)
35            return;
36        if (l.size() == h) {
37            l.add(root.val);
38        } else {
39            l.set(h, root.val);
40        }
41        traverse(root.left, h + 1, l);
42        traverse(root.right, h + 1, l);
43        return;
44
45    }
46
47    public List<Integer> rightSideView(TreeNode root) {
48        List<Integer> ans = new ArrayList<>();
49        traverse(root, 0, ans);
50        return ans;
51    }
52}