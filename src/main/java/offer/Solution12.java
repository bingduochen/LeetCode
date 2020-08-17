package offer;

public class Solution12 {

    public boolean exist(char[][] board, String word) {

        if (board == null || board.length == 0 || board[0].length == 0 || word == null || word.length() == 0) {
            return false;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (help(board, i, j, word, 0, new boolean[board.length][board[0].length])) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    public boolean help(char[][] board, int row, int col, String word, int index, boolean[][] visit) {
        if (row >= 0 && row < board.length && col >= 0 && col < board[0].length
                && index < word.length() && !visit[row][col]) {

            if (index == word.length() - 1 && !visit[row][col] && board[row][col] == word.charAt(index)) {
                return true;
            } else if (word.charAt(index) == board[row][col]) {

                visit[row][col] = true;
                boolean result = help(board, row - 1, col, word, index + 1, visit) ||
                        help(board, row + 1, col, word, index + 1, visit) ||
                        help(board, row, col - 1, word, index + 1, visit) ||
                        help(board, row, col + 1, word, index + 1, visit);
                visit[row][col] = false;
                return result;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }


}
