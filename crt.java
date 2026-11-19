public class crt {
    static int crt(int[] a, int[] m){
        int M = 1;
        for(int v:m) M *= v;
        int x = 0;
        for(int i = 0; i<m.length; i++){
            int Mi = M/m[i], inv = 0;
            for(int j = 1; j< m[i]; j++){
                if(Mi * j % m[i] == 1) {
                    inv = j;
                    break;
                }
            }
             x += a[i] *Mi* inv;
        }
    }
}
