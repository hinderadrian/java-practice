package codewars;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInString {

    public static void main(String[] args) {
        Map<Character, Integer> countResult = count("aabbbac");
        System.out.println(countResult);
    }

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> result = new HashMap<>();
        char[] characters = str.toCharArray();

        for (char c : characters) {
            if (!result.containsKey(c)) {
                result.put(c, Long.valueOf(str.chars().filter(characterValue -> characterValue == c).count()).intValue());
            }
        }

        return result;
    }
}