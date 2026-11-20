class RatMaze {
    static boolean isSafe(int[][] maze, int x, int y, int[][] sol, int N){
        return x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1 && sol[x][y] == 0;
    }

    static boolean solveRatMaze(int[][] maze, int x, int y, int sol[][], int N){
        if( x == N-1 && y==N-1 && maze[x][y] == 1 && sol[x][y] == 0){
            sol[x][y] = 1;
            return true;
        }

        if(isSafe(maze, x, y, sol, N)){
            sol[x][y] = 1;
            if(solveRatMaze(maze, x+1, y, sol, N)) return true;
            if(solveRatMaze(maze, x-1, y, sol, N)) return true;
            if(solveRatMaze(maze, x, y+1, sol, N)) return true;
            if(solveRatMaze(maze, x, y-1, sol, N)) return true;
            sol[x][y] = 0;
        }

        return false;
    }
}

class NQueens{
    static boolean isSafe(char[][] board, int x, int y, int n){
        for(int i = 0; i<n; i++){
            if(board[x][i] == 'Q') return false;
        }
        for(int i = n-1, j=n-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }
        for(int i = 0, j = n-1; i<n && j>=0; i++, j--){
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }

    static boolean solveNQueens(char board[][], int n, int x, int y){
        if(y >= n) return true;
// check every row
        for(int i = 0; i<n; i++){
            if(isSafe(board, i, y, n)){
                board[i][y] = 'Q';
                if(solveNQueens(board, n, x, y+1)) return true;
                board[i][y] = '-';
            }
        }
        return false;
    }
}

class KnightTour{
    static int moves[][] ={{1,2},{2,1},{-1,2},{2,-1},{1,-2},{-2,1},{-1,-2},{-2,-1}};
    static boolean isSafe(int[][] board, int x, int y, int n){
        return x >= 0 && x < n && y >= 0 && y < n && board[x][y] == -1;
    }
    static boolean solveKnightTour(int[][] board, int x, int y, int move, int n){
        if(move == n*n) return true;

        for(int i = 0; i<8; i++){
            int nx = x + moves[i][0];
            int ny = y + moves[i][1];

            if(isSafe(board, nx, ny, n)){
                board[nx][ny] = move;
                if(solveKnightTour(board, nx, ny, move+1, n)) return true;
                board[nx][ny] = -1;
            }
        }
        return false;
    }
}