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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        List<Integer> res = new ArrayList<>();
19
20        if (root == null) return res;
21
22        traverse(root, res);
23
24        return res;
25    }
26
27    void traverse(TreeNode node, List<Integer> res) {
28        if (node == null) return;
29
30        traverse(node.left, res);
31        traverse(node.right, res);
32        res.add(node.val);
33    }
34}