public class MajorityElement {
    static int majorityBoyerMoore(int[] a){
        int cand = -1, count =0 ;
        for(int x:a){
            if(count == 0){
                cand =x;
                count = 1;
            }else if(x == cand) count++;
            else count--;
        }

        int freq = 0;
        for(int x:a) if(x==cand) freq++;
        return freq > a.length/2 ? cand : -1;
    }
}
