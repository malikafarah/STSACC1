public class flipbit {
    static int longestOne(int[] a, int k){
        /*1.Expand window size using right
        2. cal number of zeros
        3.if zeros exceed k move left
        4. calc window length
        5. update max length */

        int left = 0;
        int zeros =0;
        int max = 0;

        for(int right = 0; right<a.length; right++){

            if(a[right] == 0){
                zeros++;
            }

            if(zeros > k){
                //if left most element is 0 then decrease 0
                if(a[left] == 0){
                    zeros--;
                }
                left++;
            }

            int length = right - left +1;

            max = Math.max(max,length);
        }
    }
}
