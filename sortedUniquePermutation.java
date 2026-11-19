//brute force not working waaaaaaaaaa😭

import java.util.*;

class Main {

    static HashSet<String> set = new HashSet<>();

    static void permute(String s, String ans) {

        if (s.length() == 0) {
            set.add(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Skip duplicate characters at the same level
            if (s.indexOf(ch) != i) {
                continue;
            }

            String remaining = s.substring(0, i) + s.substring(i + 1);

            permute(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {

        String s = "AABDASC";

        permute(s, "");

        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list);

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("Total: " + list.size());
    }
}