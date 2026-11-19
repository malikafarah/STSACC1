public class blockSwap {
    //brute force
    static void rotateLeft(int[] a, int d) {

        int n = a.length;

        if (n == 0) return;

        d = d % n;

        for (int i = 0; i < d; i++) {

            int first = a[0];

            for (int j = 0; j < n - 1; j++) {
                a[j] = a[j + 1];
            }

            a[n - 1] = first;
        }
    }
}
