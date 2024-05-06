package medium.practice;

public class Palindrome {
    public static void main(String[] args) {
        String original = "yanacanay";
        String reverse = "";

        System.out.println("Word to valid: " + original);

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        System.out.println("Palindrome or not: " + reverse.equals(original));
    }
}
