package leetcodechallenges;

public class PalindromeNumber {

  public static void main(String[] args) {
    int numberToValidate = 12321;

    boolean result = isPalindromeNumberOne(numberToValidate);
    boolean resultWith2ndMethod = isPalindromeNumberTwo(numberToValidate);
    boolean resultWithMyWay = myWayPalindrome(numberToValidate);

    System.out.printf("First method %s \n", result);
    System.out.printf("Second method %s \n", resultWith2ndMethod);
    System.out.printf("My way method %s \n", resultWithMyWay);
  }

  public static boolean myWayPalindrome(int x) {
    StringBuilder stringNumber = new StringBuilder(String.valueOf(x));
    return stringNumber.reverse().toString().equals(String.valueOf(x));
  }

  public static boolean isPalindromeNumberOne(int x) {
    String stNumber = Integer.toString(x);
    int length = stNumber.length();
    boolean booleanResult = false;

    for (int i = 0; i < length / 2; i++) {
      if (stNumber.charAt(i) != stNumber.charAt(length - i - 1)) {
        return booleanResult;
      }
    }

    return !booleanResult;
  }

  public static boolean isPalindromeNumberTwo(int x) {
    long number = x;
    long reversed = 0;

    while (x > 0) {
      int digit = x % 10;
      reversed = (reversed * 10) + digit;
      x /= 10;
    }

    return number == reversed;
  }

}
