package leetcodechallenges;

import java.util.stream.Stream;

public class SumOfDigits {

  public static void main(String[] args) {
    /**
     * El objetivo de este ejercicio es sumar los dígitos de un número entrante
     * hasta dejarlo en un dígito, por ejemplo:
     *
     * 16 --> 1 + 6 = 7
     * 942 --> 9 + 4 + 2 = 15 --> 1 + 5 = 6
     */
    int valueToTest = 942;

    int result = digitalRoot(valueToTest);
    System.out.println("RESULTADO: " + result);

    System.out.println(digitalRootClever(valueToTest));
    System.out.println(digitalRootWithStreams(valueToTest));

    System.out.println("VALOR AL REVES: " + returnReversedNumber(65439));
  }

  public static int digitalRoot(int n) {
    System.out.println("INICIANDO LA EJECUCIÓN DEL MÉTODO digitalRoot()");
    int a = 0;

    System.out.println("Valor de a: " + a);

    while(n > 0) {
      a += (n % 10);
      System.out.println("Valor de n antes de dividirlo: " + n);
      System.out.println("Valor de a después de aplicar módulo: " + a);

      n /= 10;
      System.out.println("Valor de n después de dividirlo: " + n);

    }
    if (a >= 10) {
      return digitalRoot(a);
    }
    return a;
  }

  public static int digitalRootClever(int n) {
    return (n != 0 && n % 9 == 0) ? 9 : n %9;
  }

  public static int digitalRootWithStreams(int n) {
    if (n < 10) {
      return Stream.of(String.valueOf(n).split(""))
          .mapToInt(Integer::parseInt)
          .sum();
    } else {
      return digitalRootWithStreams(Stream.of(String.valueOf(n).split(""))
          .mapToInt(Integer::parseInt)
          .sum());
    }
  }

  public static int returnReversedNumber(int originalValue) {
    String newValue = "";

    while(originalValue > 0) {
      newValue += "" + originalValue % 10;
      originalValue /= 10;
    }
    return Integer.parseInt(newValue);
  }

}
