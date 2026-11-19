//incremental sieve : generates prime numbers one at a time

import java.util.*;

public class incrementalSieve {
    int cur =2;
    Map<Integer, List<Integer>> comp = new HashMap<>();
    int next(){
        while(true){
            List<Integer> ps = comp.remove(cur);

            if(ps == null){
                comp.put(cur*cur, new ArrayList<>(List.of(cur)));
                return cur++;
            }

            for(int p: ps){
                comp.computeIfAbsent(cur + p, k -> new ArrayList<>()).add(p);
            }

            cur++;
        }
    }
}
