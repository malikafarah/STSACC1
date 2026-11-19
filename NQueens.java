
class NQueens {
    static boolean isSafe(char[][] board, int row, int col, int n){
        for(int i = 0; i<col; i++){
            if(board[row][i] == 'Q') return false;
        }
        for(int i = row, j = col; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }
        for(int i = row, j = col; i<n && j>=0; i++, j--){
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }

    static boolean solveNQueens(char[][] board, int col, int n){
        if(col>=n) return true;
        for(int i = 0; i<n;i++){
            if(isSafe(board, i, col, n)){
                board[i][col] = 'Q';
                if(solveNQueens(board, col+1, n)) return true;
                board[i][col] = '-';
            }
        }
        return false;
    }

}


