// Last updated: 5/28/2026, 7:20:58 PM
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
16// class Solution {
17//     public boolean hasPathSum(TreeNode root, int targetSum) {
18//         if (root == null) {
19//             return false;
20//         }
21//         if (root.left == null && root.right == null) {
22//             return targetSum == root.val;
23//         }
24//         boolean leftSum = hasPathSum(root.left, targetSum - root.val);
25//         boolean rightSum = hasPathSum(root.right, targetSum - root.val);
26//         return leftSum || rightSum;
27//     }
28// }
29class Solution{
30    static boolean dfs(TreeNode root,int sum,int target){
31        if(root==null){
32            return false;
33        }
34        if(root.left==null&&root.right==null){
35            return sum+root.val==target;
36        }
37        sum= sum+root.val;
38        return dfs(root.left,sum,target)||dfs(root.right,sum,target);
39    }
40    public boolean hasPathSum(TreeNode root,int targetSum){
41        return dfs(root,0,targetSum);
42    }
43}