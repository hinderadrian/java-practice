package medium.practice;

import java.util.*;

public class PrintEvenNumOfList {

    public static void main(String[] args) {
        int[] arrayNumbers = new int[] {9,10,15,8,49,25,98,32,10};

        System.out.println("The most optimal way:");
        Arrays.stream(arrayNumbers).sorted().distinct().filter(number -> number % 2 == 0).forEach(System.out::println);

        System.out.println("The typical way:");
        Set<Integer> setArray = new HashSet<>();

        for(int i = 0; i < arrayNumbers.length; i++) {
            setArray.add(arrayNumbers[i]);
        }

        ArrayList<Integer> arrayNumbers2 = new ArrayList<>(setArray);

        Collections.sort(arrayNumbers2);

        for (int number : arrayNumbers2) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

    }
}
