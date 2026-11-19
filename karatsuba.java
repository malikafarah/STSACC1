public class karatsuba {
    static long kar(long x, long y) {
        if (x < 10 || y < 10) return x * y;

        int half = Math.max(Long.toString(x).length(), Long.toString(y).length()) / 2;
        long p = (long) Math.pow(10, half);
        long a = x / p,
        b = x % p, 
        c = y / p, 
        d = y % p;

        long ac = kar(a, c), bd = kar(b, d);

        long mid = kar(a + b, c + d) - ac - bd;
        
        return ac * p * p + mid * p + bd;
    }
}
