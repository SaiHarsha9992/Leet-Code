class Solution {
    private boolean isSafe(char[][] board, int row, int col, char num) {
        int n = board.length;

        for (int i = 0; i < n; i++) {
            if (i != row && board[i][col] == num) return false;
            if (i != col && board[row][i] == num) return false; 
        }

        int sqrt = (int) Math.sqrt(n);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        for (int i = 0; i < sqrt; i++) {
            for (int j = 0; j < sqrt; j++) {
                int r = boxRowStart + i;
                int c = boxColStart + j;
                if ((r != row || c != col) && board[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean sudokuSolve(char[][] board) {
        int n = board.length;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (board[row][col] != '.') {
                    if (!isSafe(board, row, col, board[row][col])) {
                        return false; 
                    }
                }
            }
        }
        return true;  
    }

    public boolean isValidSudoku(char[][] board) {
        return sudokuSolve(board);
    }
}
