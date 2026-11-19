public class toggleSwitch {
    public static void main(String[] args) {
        int[] a = new int[N + 1];
        while (Q-- > 0) {
            int x = sc.nextInt();
            for (int i = x; i <= N; i += x) a[i] ^= 1;
        }
    }
}
