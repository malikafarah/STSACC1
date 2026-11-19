import java.util.ArrayList;
import java.util.Collections;

class leadersinArray {
    //a leader is whose right most elements are less than it
    static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[arr.length - 1];
        ans.add(max);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans); // restore left-to-right order
        return ans;
    }
}
