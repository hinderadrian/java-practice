package udemy;

import java.util.HashMap;
import java.util.Map;

public class MostFreqItemArr {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.
        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};

        System.out.println(mostFrequent(array2));
    }

    // Implement your solution below.
    public static Integer mostFrequent(int[] givenArray) {
        Integer maxItem = null;
        int maxCount = 0;
        Map<Integer, Integer> valueMap = new HashMap<>();

        for (int value : givenArray) {
            if(!valueMap.containsKey(value)) {
                valueMap.put(value, 1);
            } else {
                valueMap.put(value, valueMap.get(value) + 1);
            }

            if (valueMap.get(value) > maxCount) {
                maxCount = valueMap.get(value);
                maxItem = value;
            }
        }
        return maxItem;
    }
}
