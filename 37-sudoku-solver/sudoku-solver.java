class Solution {

    private boolean isSafe(char[][] board, int row, int col, char num) {
        int n = board.length;

        for (int i = 0; i < n; i++) {
            if (board[i][col] == num) return false;
            if (board[row][i] == num) return false;
        }

        int sqrt = (int) Math.sqrt(n);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        for (int i = 0; i < sqrt; i++) {
            for (int j = 0; j < sqrt; j++) {
                if (board[boxRowStart + i][boxColStart + j] == num) {
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
                if (board[row][col] == '.') {
                    for (char k = '1'; k <= '9'; k++) {
                        if (isSafe(board, row, col, k)) {
                            board[row][col] = k;
                            if (sudokuSolve(board)) return true;
                            board[row][col] = '.'; 
                        }
                    }
                    return false; 
                }
            }
        }

        return true; 
    }

    public void solveSudoku(char[][] board) {
        sudokuSolve(board);
    }
}
