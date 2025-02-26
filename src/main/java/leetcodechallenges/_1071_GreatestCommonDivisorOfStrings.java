package leetcodechallenges;

import java.util.*;

public class _1071_GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {

        String str1 = "ABABABAB";
        String str2 = "ABAB";

        String result = gcdOfStringsPersonal(str1, str2);
        System.out.println(result);
    }

    public static String gcdOfStringsPersonal(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        StringBuilder strResult = new StringBuilder();

        if (!(str1 + str2).equals(str2 + str1)) return "";

        int count = (str1.length() - str1.replace(str2, "").length()) / str2.length();
        if (count > 1) return str2;

        for (int i = 0; i < minLength; i++) {
            if (i > minLength - 1) break;

            if (Objects.equals(str1.charAt(i), str2.charAt(i))) {
                if(strResult.toString().startsWith(str1.substring(i, i + 1))) break;
                strResult.append(str1.charAt(i));
            }
        }
        return strResult.toString();
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static String gcdOfStrings(String str1, String str2) {
        // Check if they have non-zero GCD string.
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Get the GCD of the two lengths.
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

}
