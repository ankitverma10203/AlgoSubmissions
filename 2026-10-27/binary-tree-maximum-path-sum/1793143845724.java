class Solution {
    public int maxPathSum(TreeNode root) {
        int[] res = sum(root);
    }

    private int[] sum(TreeNode root) {

        if (root == null) return new int[] {0, Integer.MIN_VALUE};

        int[] left = sum(root.left);
        int[] right = sum(root.right);

        int through = left[0] + right[0] + root.val;
        int max = Math.max(Math.max(left[1], right[1]), Math.max(include, through));
        int include = Math.max(Math.max(left[0], right[0]) + root.val, root.val);

        return res[1];

        return new int[] {include, max};
    }
}