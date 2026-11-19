//shortcut : do simple sieve and then add a range filter 
import java.util.*;

class Main {
    static void segmented(int low, int high) {

        // Create array up to high
        boolean[] prime = new boolean[high + 1];
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        // Normal Sieve
        for (int i = 2; i * i <= high; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= high; j += i) {
                    prime[j] = false;
                }
            }
        }

        // Print primes only in the given range
        for (int i = Math.max(low, 2); i <= high; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        segmented(10, 30);
    }
}
