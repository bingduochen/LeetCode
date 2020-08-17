package offer;

public class Solution4 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int i = 0;
        int j = matrix[0].length - 1;
        int row = matrix.length;
        int col = matrix[0].length;
        while (i < row && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;


    }

    public static void main(String[] args) {
        System.out.println(findNumberIn2DArray(new int[0][], 0));
    }
}
