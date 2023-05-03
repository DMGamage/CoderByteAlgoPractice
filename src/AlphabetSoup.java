import java.util.Arrays;

/**
 * Have the function AlphabetSoup(str) take the str string parameter being passed
 * and return the string with the letters in alphabetical order (i.e. hello becomes ehllo).
 * Assume numbers and punctuation symbols will not be included in the string.
 */


public class AlphabetSoup {

    private static String alphabetSoup(String str){
        char[] letters =str.toCharArray();
        Arrays.sort(letters);
        return String.valueOf(letters);
    }
}
