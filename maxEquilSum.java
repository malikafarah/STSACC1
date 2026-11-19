public class maxEquilSum {
    static int maxEq(int arr[]){
        int n = arr.length, res = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            int pre = arr[i], suff = arr[i];
            for(int j = 0; j<i; j++) pre += arr[j];
            for(int j = n-1; j>i; j--) suff += arr[j];
            if(pre == suff) res = Math.max(res, pre);
        }
        return res;
    }
}
