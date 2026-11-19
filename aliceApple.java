public class aliceApple {
    static int minApples(int M, int K, int S, int W, int E) {
        if (M <= S * K) return M;                   // south alone is enough
        if (M <= S * K + W + E) return S * K + (M - S * K) * K;
        return -1;                                  // cannot guarantee M red apples
    }
}
