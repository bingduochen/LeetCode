package offer;

public class Solution27 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        help(root);
        return root;
    }

    public void help(TreeNode root) {
        if (root != null) {
            TreeNode tmp;
            tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            help(root.left);
            help(root.right);

        }
    }
}
