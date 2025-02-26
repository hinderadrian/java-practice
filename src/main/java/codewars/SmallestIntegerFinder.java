package codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int lowerValue = Integer.MAX_VALUE;
        // Another ways to do it
        // lowerValue = Arrays.stream(args).min().orElse(0);
        //lowerValue = IntStream.of(args).min().getAsInt();
        for (int number : args) {
            if (number < lowerValue) {
                lowerValue = number;
            }
        }
        return lowerValue;
    }
}