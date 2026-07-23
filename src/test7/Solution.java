package test7;

public class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board);
    }

    private boolean backtrack(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;
                            if (backtrack(board)) {
                                return true;
                            }
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    // 校验数字是否可填入
    private boolean isValid(char[][] board, int row, int col, char num) {
        // 检查行
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) return false;
        }
        // 检查列
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }
        // 检查3*3小九宫格
        int boxRow = row / 3 * 3;
        int boxCol = col / 3 * 3;
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }
        return true;
    }
}
