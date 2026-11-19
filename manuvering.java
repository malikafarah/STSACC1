package STSACC1;
//to - do return number of moves to reach the destination

class manuvering{
    static int pathRec(int m, int n){
        if(m == 1 || n==1 ){
            return 1;
        }
        return pathRec(m-1,n) + pathRec(m,n-1);
    }

    static int dp1D(int m, int n){
        int dp[] = new int[n];
        dp[0] = 1;

        for(int i = 0; i<m; i++){
            for(int j = 1; j<n; j++){
                dp[j] += dp[j-1];
            }
            
            for(int j = 0; j<n; j++){
                System.out.print(dp[j] + " ");
            }
            System.out.println();
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int ways = dp1D(5, 6);
        System.err.println(ways);
    }
}


