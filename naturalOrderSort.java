
import java.util.*;

class NaturalOrderComparator implements Comparator<String> {

    public int compare(String s1, String s2) {

        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {

            // If both characters are digits
            if (Character.isDigit(s1.charAt(i)) &&
                Character.isDigit(s2.charAt(j))) {

                int num1 = 0, num2 = 0;

                // Read first number
                while (i < s1.length() &&
                        Character.isDigit(s1.charAt(i))) {
                    num1 = num1 * 10 + (s1.charAt(i) - '0');
                    i++;
                }

                // Read second number
                while (j < s2.length() &&
                        Character.isDigit(s2.charAt(j))) {
                    num2 = num2 * 10 + (s2.charAt(j) - '0');
                    j++;
                }

                if (num1 != num2) {
                    return Integer.compare(num1, num2);
                }
            }

            else {
                int result = Character.compare(
                    s1.charAt(i), s2.charAt(j)
                );

                if (result != 0) {
                    return result;
                }

                i++;
                j++;
            }
        }

        return Integer.compare(s1.length() - i, s2.length() - j);
    }
}


//1. initialise pointers
    //2.if both char are digis build and compare numbers
    //otherwise compare chars
    //move pointer forward
    //if one string finishes the shorter remaining string comes first
