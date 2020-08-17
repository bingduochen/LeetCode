package offer;


public class Solution7 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 ||
                inorder == null || inorder.length == 0) {
            return null;
        }
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int prestart, int preend,
                          int[] inorder, int instart, int inend) {
        if (prestart <= preend && instart <= inend) {
            TreeNode node = new TreeNode(preorder[prestart]);
            int index = find(inorder, instart, inend, preorder[prestart]);

            node.left = build(preorder, prestart + 1, index - instart + prestart, inorder, instart, index-1);
            node.right = build(preorder, index - instart + prestart + 1, preend, inorder, index + 1, inend);
            return node;
        } else {
            return null;
        }


    }

    public int find(int[] arr, int start, int end, int target) {
        for (int i = start; i <= end && i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }


}
