import java.util.Arrays;

public class knightTour {
    static final int[][] MOVES = {
        {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
        {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
    };

    static boolean solveKnightTour(int n){
        int[][] board = new int[n][n];
        board[0][0] = 1;

        if(!solve(board,0,0,2)) return false;

        for(int[] row: board) System.out.println(Arrays.toString(row));
        return true;
    }

    static boolean solve(int[][] board, int r, int c, int step){
        int n = board.length;
        if(step > n*n) return true;

        for(int[] m: MOVES){
            int nr = r+m[0], nc=c+m[1];
            if(nr >= 0 && nr < n && nc >= 0 && nc < n && board[nr][nc] == 0){
                board[nr][nc] = step;
                if (solve(board, nr, nc, step + 1)) return true;
                board[nr][nc] = 0;
            }
        }
        return false;
    }
}
