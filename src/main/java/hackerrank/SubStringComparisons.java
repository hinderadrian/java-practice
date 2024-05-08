package hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class SubStringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> validatedSegments = new ArrayList<>();

        // merge segments & segmentsTwo into segmentsThree
        for (int i = 0; i < k; i++) {
            validatedSegments.addAll(Arrays.stream(s.substring(i).split("(?<=\\G.{" + k + "})")).filter(value -> value.length() == 3).collect(Collectors.toList()));
        }

        // Complete the function
        Collections.sort(validatedSegments);
        System.out.println(validatedSegments);


        // 'smallest' must be the lexicographically smallest substring of length 'k'
        smallest = validatedSegments.get(0);
        // 'largest' must be the lexicographically largest substring of length 'k'
        largest = validatedSegments.get(validatedSegments.size() -1);

        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargestV2(String s, int k)
    {
        String smallest = s.substring(0,k);
        String largest = "";
        int a=0;

        while(k < s.length() + 1)
        {
            if (s.substring(a,k).compareTo(smallest) < 0){
                smallest = s.substring(a,k);
            }
            if (s.substring(a,k).compareTo(largest) > 0){
                largest= s.substring(a,k);
            }
            a += 1;
            k += 1;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargestV2(s, k));
    }
}