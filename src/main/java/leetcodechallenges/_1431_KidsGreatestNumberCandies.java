package leetcodechallenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1431_KidsGreatestNumberCandies {

    public static void main(String[] args) {
        int [] candies = new int[]{2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies)
                .mapToObj(candyKid -> candyKid + extraCandies >= maxCandies)
                .collect(Collectors.toList());
    }
}
