public abstract class eulerphi {
    static int phi(int n){
        int result = n;
        for(int p = 2; p*p <= n; p++){
            if(n%p == 0){
                while(n%p == 0) n /= p;
                result -= result/p;
            }
        }
        
    }
}
