public class hourglass {
    static int maxHourglass(int[][] m) {
    int best = Integer.MIN_VALUE;
    for (int i = 0; i + 2 < m.length; i++)
        for (int j = 0; j + 2 < m[0].length; j++) {
            int sum = m[i][j] + m[i][j + 1] + m[i][j + 2]
                    + m[i + 1][j + 1]
                    + m[i + 2][j] + m[i + 2][j + 1] + m[i + 2][j + 2];
            best = Math.max(best, sum);
        }
    return best;
}
}
