package medium.practice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String firstWord = "own";
        String secondWord = "now";

        char[] chArrayOne = firstWord.toCharArray();
        char[] chArrayTwo = secondWord.toCharArray();

        Arrays.sort(chArrayOne);
        Arrays.sort(chArrayTwo);

        for (char c: chArrayOne) {
            firstWord.chars().filter(characterValue -> characterValue == c).count();
        }

        System.out.println(Arrays.equals(chArrayOne, chArrayTwo));
    }
}
