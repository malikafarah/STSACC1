class lexicography{

    //s1 : count the freq of characters
    //s2: count odd freq characters (if num odd > 1) no palindrom
    //s3: build first half (take half frequency in alphabetical order)
    //s4: Add the middle character
    //s5:Reverse the first half

    static String smallestPalindrome(String s){
        int freq[] = new int[26];

        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        int oddCount=0;
        String mid ="";
        for(int i = 0; i<26 ; i++){
            if(freq[i]%2!=0){
                oddCount++;
                mid += (char)(i+'a');
            } 
        }

        if(oddCount > 1) {
            return "not possible";
        }

        String half = "";

        for(int i = 0 ; i<26; i++){
            for(int j = 0; j<freq[i]/2; j++){
                half += (char)(i+'a');
            }
        }

        String result = half;
        if(oddCount <= 1){
            result += mid;
        }
        for(int i=half.length()-1; i>=0; i++){
            result += half.charAt(i);
        }


        return result;

    }

}

