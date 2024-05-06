package medium.practice;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7};
        int numberOfPositions = 2;

        leftRotation(arrayOfNumbers, numberOfPositions);
        rightRotation(arrayOfNumbers, numberOfPositions);
    }

    private static void leftRotation(int[] arrayOfNumbers, int numberOfPositions) {
        for (int i=0; i < numberOfPositions; i++) {
            int tempValue = arrayOfNumbers[0];

            for (int j=0; j < arrayOfNumbers.length - 1; j++) {
                arrayOfNumbers[j] = arrayOfNumbers[j + 1];
            }
            arrayOfNumbers[arrayOfNumbers.length - 1] = tempValue;
        }
        System.out.printf("Input array after left rotation by %s position(s): ", numberOfPositions);
        System.out.println(Arrays.toString(arrayOfNumbers));
    }

    private static void rightRotation(int[] arrayOfNumbers, int numberOfPositions) {
        for (int i=0; i < numberOfPositions; i++) {
            int tempValue = arrayOfNumbers[arrayOfNumbers.length - 1];

            for (int j = arrayOfNumbers.length - 1; j > 0; j--) {
                arrayOfNumbers[j] = arrayOfNumbers[j - 1];
            }
            arrayOfNumbers[0] = tempValue;
        }
        System.out.printf("Input array after right rotation by %s position(s): ", numberOfPositions);
        System.out.println(Arrays.toString(arrayOfNumbers));
    }
}
