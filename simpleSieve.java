public class simpleSieve {
    static void sieve(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, 2, n+1,true);
        for(int i = 2; i*i <= n; i++){
            if(prime[i]){
                for(int j = i*i; j<=n; j+=i) prime[j] = false;
            }
        }
        for(int i = 2; i <= n; i++){
            if(prime[i]) System.out.print(i+" ");
        }
    }
}
