import java.util.ArrayList;
import java.util.List;

public class stogramaticnum {
    static char flip(char c) {
        switch (c) {
            case '0': return '0'; 
            case '1': return '1'; 
            case '8': return '8';
            case '6': return '9'; 
            case '9': return '6';
            default: return '?';
        }
    }
    static boolean isStrob(String s) {            // O(n) time, O(1) space
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--)
            if (flip(s.charAt(i)) != s.charAt(j)) return false;
        return true;
    }
    static List<String> gen(int n, int total) {   // call gen(n, n)
        if (n == 0) return List.of("");
        if (n == 1) return List.of("0", "1", "8");
        List<String> res = new ArrayList<>();
        for (String mid : gen(n - 2, total)) {
            if (n != total) res.add("0" + mid + "0");   // no leading zero
            res.add("1" + mid + "1"); res.add("8" + mid + "8");
            res.add("6" + mid + "9"); res.add("9" + mid + "6");
        }
        return res;
    }
}
