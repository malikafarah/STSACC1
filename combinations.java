import java.util.Arrays;
import java.util.Scanner;

class combinations{
    static void combUtil2(int[] arr, int n, int r, int index, int[] data, int i) {
        if (index == r) {
            for (int j = 0; j < r; j++) System.out.print(data[j] + " ");
            System.out.println();
            return;
        }
        if (i >= n) return;
        data[index] = arr[i];
        combUtil2(arr, n, r, index + 1, data, i + 1); // include arr[i]
        combUtil2(arr, n, r, index, data, i + 1);     // exclude arr[i]
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        Arrays.sort(nums); 
        int k = input.nextInt();
        input.close();

        combine(nums, 0, k, 0, "");
    }
}