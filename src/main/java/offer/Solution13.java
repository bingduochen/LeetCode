package offer;

public class Solution13 {

    public int movingCount(int m, int n, int k) {
        int[] result = new int[1];
        compute(new boolean[m][n], 0, 0, result, k);
        return result[0];
    }


    public void compute(boolean[][] visit, int row, int col, int[] result, int k) {
        if (row >= 0 && row < visit.length && col >= 0 && col < visit[0].length && !visit[row][col]) {

            if (getSum(row, col, k)) {
                visit[row][col] = true;
                result[0] = result[0] + 1;
                compute(visit, row + 1, col, result, k);
                compute(visit, row - 1, col, result, k);
                compute(visit, row, col + 1, result, k);
                compute(visit, row, col - 1, result, k);
            }

        }
    }


    public boolean getSum(int row, int col, int maxSum) {
        int result = 0;
        while (row > 0) {
            result += row % 10;
            row = row / 10;
        }

        while (col > 0) {
            result += col % 10;
            col = col / 10;
        }

        return result <= maxSum;
    }
}
