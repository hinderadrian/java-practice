package leetcodechallenges;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  public static void main(String[] args) {
    System.out.println("-- Convert roman to integer numbers --");

    String romanNumberToConvert = "LVIII";
    int numberConverted = romanToInt(romanNumberToConvert);

    System.out.println("RESULT OF " + romanNumberToConvert + " IS: " + numberConverted);

    int resultTwo = romanToInt2ndOpc(romanNumberToConvert);
    System.out.println("RESULT OF " + romanNumberToConvert + " IS: " + resultTwo);
  }

  public static int romanToInt(String romanNumber) {
    Map<Character, Integer> romanNumbersMap = new HashMap<>();
    romanNumbersMap.put('I', 1);
    romanNumbersMap.put('V', 5);
    romanNumbersMap.put('X', 10);
    romanNumbersMap.put('L', 50);
    romanNumbersMap.put('C', 100);
    romanNumbersMap.put('D', 500);
    romanNumbersMap.put('M', 1000);

    int sumOfValues = 0;

    for (int i = 0; i < romanNumber.length(); i++) {
      if (i < romanNumber.length() - 1 && romanNumbersMap.get(romanNumber.charAt(i)) < romanNumbersMap.get(
          romanNumber.charAt(i + 1))) {
        sumOfValues -= romanNumbersMap.get(romanNumber.charAt(i));
      } else {
        sumOfValues += romanNumbersMap.get(romanNumber.charAt(i));
      }
    }
    return sumOfValues;
  }

  public static int romanToInt2ndOpc(String s) {
    int sumOfValues = 0, number = 0;

    for(int i = s.length() - 1; i >= 0; i--) {
      switch(s.charAt(i)) {
        case 'I': number = 1; break;
        case 'V': number = 5; break;
        case 'X': number = 10; break;
        case 'L': number = 50; break;
        case 'C': number = 100; break;
        case 'D': number = 500; break;
        case 'M': number = 1000; break;
        default: System.out.println("Value doesn't exist."); break;
      }

      if (4 * number < sumOfValues) sumOfValues -= number;
      else sumOfValues += number;
    }

    return sumOfValues;
  }

}
