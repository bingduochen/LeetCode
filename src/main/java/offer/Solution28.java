package offer;

public class Solution28 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return help(root.left, root.right);
    }

    public boolean help(TreeNode leftchild, TreeNode rightchild) {

        if (leftchild == null && rightchild == null) {
            return true;
        } else if (leftchild != null && rightchild == null || (leftchild == null && rightchild != null)) {
            return false;
        } else if (leftchild.val == rightchild.val) {
            return help(leftchild.left, rightchild.right) && help(leftchild.right, rightchild.left);
        } else {
            return false;
        }
    }
}
