package offer;

public class Solution29 {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }

        int[] result = new int[matrix.length * matrix[0].length];
        help(matrix, 0, matrix[0].length - 1, matrix.length - 1, 0, result, 0);
        return result;
    }

    public static void help(int[][] matrix, int topRow, int rightCol, int downRow, int leftCol, int[] result, int index) {
        if (topRow <= downRow && leftCol <= rightCol) {
            //上面一行
            for (int i = leftCol; i <= rightCol; i++) {
                result[index++] = matrix[topRow][i];
            }

            // 右边一列
            for (int i = topRow + 1; i <= downRow; i++) {
                result[index++] = matrix[i][rightCol];
            }

            // 下面一行
            if (topRow != downRow) {
                for (int i = rightCol - 1; i >= leftCol; i--) {
                    result[index++] = matrix[downRow][i];
                }
            }

            //左边一列
            if (leftCol != rightCol) {
                for (int i = downRow - 1; i >= topRow + 1; i--) {
                    result[index++] = matrix[i][leftCol];
                }
            }
            help(matrix, topRow + 1, rightCol - 1, downRow - 1, leftCol + 1, result, index);
        } else {
            return;
        }

    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] arr = spiralOrder(matrix);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}


