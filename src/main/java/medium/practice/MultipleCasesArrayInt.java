package medium.practice;

import java.util.*;
import java.util.stream.Collectors;

public class MultipleCasesArrayInt {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[] { 9, 10, 15, 8, 49, 25, 98, 32, 10, 9, 49 };

        findFirstElement(arrayNumbers);

        findDuplicatesInList(arrayNumbers);

        printNumbersStartingWithOne(arrayNumbers);

        minimumAndMaximum(arrayNumbers);

        sortElementsInAscAndDesc(arrayNumbers);

        findUniqueNumbersFromList();

        listWithoutDuplicatesSameOrder(arrayNumbers);

        printOddAndEventList();
    }

    public static void findFirstElement(int[] array) {
        System.out.println("--- Find First Element ---");
        Arrays.stream(array).findFirst().ifPresent(System.out::println);
    }

    public static void findDuplicatesInList(int[] array) {
        System.out.println("--- Find Duplicates ---");
        Set<Integer> setList = new HashSet<>();

        Arrays.stream(array).filter(number -> !setList.add(number)).forEach(System.out::println);
    }

    public static void printNumbersStartingWithOne(int[] array) {
        System.out.println("--- Print Numbers Starting With One ---");
        Arrays.stream(array).mapToObj(value -> value + "")
                .filter(value -> value.startsWith("1"))
                .forEach(System.out::println);
    }

    public static void minimumAndMaximum(int[] array) {
        System.out.println("--- Minimum and Maximum ---");
        Arrays.stream(array).min().ifPresent(System.out::println);
        Arrays.stream(array).max().ifPresent(System.out::println);
        // Another way
        //System.out.println(Arrays.stream(array).min().getAsInt());
        //System.out.println(Arrays.stream(array).max().getAsInt());
    }

    public static void sortElementsInAscAndDesc(int[] array) {
        System.out.println("--- Sort Elements In Asc and Desc ---");

        System.out.println("Ascending sorted list:  ");
        Arrays.stream(array).sorted().forEach(System.out::println);
        System.out.println("Descending sorted list:  ");
        Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);

    }

    public static void findUniqueNumbersFromList() {
        System.out.println("--- Find unique numbers form a list ---");

        List list = Arrays.asList(11, 22, 33, 44, 11, 22);

        System.out.println(list.stream().filter(number -> Collections.frequency(list, number) == 1)
                .collect(Collectors.toList()));

    }

    public static void listWithoutDuplicatesSameOrder(int[] array) {
        System.out.println("--- List without duplicates in the same order ---");

        List<Integer> uniqueList = new ArrayList<>();

        for (int element : array) {
            if (Collections.frequency(uniqueList, element) == 0) {
                uniqueList.add(element);
            }
        }
        System.out.printf("List without duplicates -> %s", uniqueList);
    }

    public static void printOddAndEventList() {
        System.out.println("--- Print Odd & Even list ---");

        int[] arrayNumbers = new int[] {1, 2, 4, 6, 7};

        Map<String, List<Integer>> result = Arrays.stream(arrayNumbers)
                .boxed()
                .collect(Collectors.groupingBy(t -> t % 2 == 0 ? "EVEN" : "ODD"));

        System.out.println(result);
    }


}
