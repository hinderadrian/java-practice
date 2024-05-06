package medium.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MultipleCasesStrings {
    public static void main(String[] args) {

        findUniqueValuesStringArray();

        countEachCharacterString();

        occurrenceOfElements();

        elementsByFrequency();
    }

    public static void findUniqueValuesStringArray() {
        System.out.println("--- findOnlyDuplicatesStringArray ---");

        List<String> originalList = Arrays.asList("abc", "def", "xyz", "mno", "pqr", "def", "xyz", "stu");

        originalList.stream().distinct().forEach(System.out::println);
    }

    public static void countEachCharacterString() {
        System.out.println("--- countEachCharacterString ---");

        String text = "String data to count each character";

        Map<String, Long> countMap = Arrays.stream(text.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));

        System.out.println(countMap);
    }

    public static void occurrenceOfElements() {
        System.out.println("--- occurenceOfElements ---");

        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        Map<String, Long> map;

        map = names.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));
        System.out.println(map);
    }

    public static void elementsByFrequency() {
        System.out.println("--- elementsByFrequency ---");

        List<String> words = Arrays.asList("orange", "apple", "banana", "banana", "banana", "apple", "orange", "banana");
        Map<String, Long> sortedWordCounts = words.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), TreeMap::new, Collectors.counting()));
        System.out.println(sortedWordCounts);
    }

}
