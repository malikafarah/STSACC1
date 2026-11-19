public class binaryPalindrome {

    static boolean isBinPal(int n) {
        String s = Integer.toBinaryString(n);
        for (int i = 0, j = s.length() - 1; i < j; i++, j--)
            if (s.charAt(i) != s.charAt(j)) return false;
        return true;
    }

    static boolean isBinPalBits(int n) {          // no strings
        int rev = 0, c = n;
        while (c > 0) { 
            rev = (rev << 1) | (c & 1); 
            c >>= 1; 
        }
        return rev == n;
    }

    static int nth(int n) {
        int x = 0;
        while (n > 0) if (isBinPal(++x)) n--;
        return x;
    }
}
