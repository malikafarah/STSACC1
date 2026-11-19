class maxproductsubarray {
    static int maxProduct(int[] a){
        int max = a[0], min = a[0], best = a[0];
        for(int i = 0 ; i<n; i++){
            int x = a[i];
            int hi = Math.max(x, Math.max(max*x, min*x));
            int lo = Math.min(x, Math.min(max*x, min*x));
            max = hi;
            min = lo;
            best = Math.max(best, max);
        }

        return best;
    }
}
