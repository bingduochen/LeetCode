package offer;

public class Solution26 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }

        if (help(A, B)) {
            return true;
        } else {
            return isSubStructure(A.left, B) || isSubStructure(A.right, B);
        }


    }

    public boolean help(TreeNode heada, TreeNode headb) {
        if ((heada == null && headb == null) || (heada != null && headb == null)) {
            return true;
        } else if (heada == null && headb != null) {
            return false;
        } else if (heada.val == headb.val) {
            return help(heada.left, headb.left) && help(heada.right, headb.right);
        } else {
            return false;
        }
    }

}
