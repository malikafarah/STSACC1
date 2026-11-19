public class gcd {
    static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
    static int gcdLoop(int a, int b) {            // same idea, no recursion
        while (b != 0) { int t = a % b; a = b; b = t; }
        return a;
    }
    static int[] ext(int a, int b) {              // returns {g, x, y}
        if (a == 0) 
            return new int[]{b, 0, 1};
        int[] r = ext(b % a, a);
        return new int[]{
            r[0], r[2] - (b / a) * r[1], r[1]
        };
    }
}
