public class longestSubstringPalindrome {
    
    static String modify(String s) {

        StringBuilder sb = new StringBuilder("#");

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append('#');
        }

        return sb.toString();
    }

    static int manacher(String s) {

        String str = modify(s);

        int n = str.length();

        int[] p = new int[n];

        int center = 0;
        int right = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {

            int mirror = 2 * center - i;

            // Reuse previous palindrome information
            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Expand around current position
            int left = i - p[i] - 1;
            int r = i + p[i] + 1;

            while (left >= 0 && r < n &&
                str.charAt(left) == str.charAt(r)) {

                p[i]++;
                left--;
                r++;
            }

            // Update center and right boundary
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            // Find maximum palindrome length
            if (p[i] > max) {
                max = p[i];
            }
        }

        return max;
    }

    //brute force method

    static int longestPalindrome(String s){
        int max = 0;

        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){
                String sub = s.substring(i, j+1);
                String rev = new StringBuilder(sub).reverse().toString();

                if(sub.equals(rev)){
                    max = Math.max(max, sub.length());
                }
            }
        }

        return max;
        
    }
}
