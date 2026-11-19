class moveHyphen {
    static void moveHyphensSwap(char[] str){
        int i = str.length-1;
        for(int j = i; j>=0; j--){
            if(str[j] != '-'){
                char t = str[j];
                str[j] = str[i];
                str[i] = t;
                i--;
            }
        }
    }

    
    static void moveHyphensCopy(char[] str) {

        int i = str.length - 1;

        // Copy all normal characters to the right
        for (int j = i; j >= 0; j--) {

            if (str[j] != '-') {
                str[i] = str[j];
                i--;
            }
        }

        // Fill remaining positions with hyphens
        while (i >= 0) {
            str[i] = '-';
            i--;
        }
    }

}
