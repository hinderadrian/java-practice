package datastructuresandalgorithms;

import java.util.Scanner;

public class Recursion {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberToCalculate;
    long result;

    System.out.println("Ingrese el número a calcular:");
    numberToCalculate = scanner.nextInt();

    if (numberToCalculate >= 0) {
      result = recursion(numberToCalculate);
      System.out.printf("Factorial de %d = %,d", numberToCalculate, result);
    } else {
      System.out.println("El número ingresado debe ser positivo");
    }
  }

  public static long recursion(int value) {
    System.out.printf("Valor actual %d\n", value);
    if (value == 0) {
      return 1;
    } else {
      return value * recursion(value - 1);
    }
  }
}
