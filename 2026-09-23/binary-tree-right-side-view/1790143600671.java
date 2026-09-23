if (root == null) return res;

        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
        List<Integer> res = new ArrayList<>();
 */
            List<Integer> level = new ArrayList<>();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            res.add(level.get(level.size() - 1));
        }

 * }
 *     }
 *         this.right = right;
        return res;
    }
}