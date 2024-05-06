package libro.cap01.cadenas;

import java.util.Scanner;

public class Cadenas6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el valor entero: ");
		int value = scanner.nextInt();

		System.out.println("Valor ingresado: " + value);
		System.out.println("Binario = " + Integer.toBinaryString(value));
		System.out.println("Octal = " + Integer.toOctalString(value));
		System.out.println("Hexadecimal = " + Integer.toHexString(value));

		System.out.print("Ingrese una base numerica: ");
		int numericBase = scanner.nextInt();

		String sBaseN = Integer.toString(value, numericBase);
		System.out.println(value + " en base("+numericBase+") = " + sBaseN);

	}
}
