import java.util.*;

class weightedSubstring {
    static int distinctSubString(String P, String Q, int K){
        HashSet<String> set = new HashSet<String>();
        
        for(int i = 0; i<P.length()-1; i++){
            int sum = 0;
            String ss = "";
            for(int j = i+1; j<P.length(); j++){
                ss += P.charAt(j);
                int pos = P.charAt(j) - 'a';
                sum += Q.charAt(pos) - '0';
                if(sum <= K) set.add(ss);
                else break;
            }
        }
        return set.size();
    }
}
