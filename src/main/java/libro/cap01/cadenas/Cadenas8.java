package libro.cap01.cadenas;

import java.util.Scanner;

public class Cadenas8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese una cadena: ");
		String s1 = scanner.next();

		System.out.print("Ingrese otra cadena: ");
		String s2 = scanner.next();

		//Muestro las cadenas para verificar lo que contienen
		System.out.println("s1 = ["+s1+"]");
		System.out.println("s2 = ["+s2+"]");

		//Esto está mal!!
		if (s1 == s2) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("Son distintas.");
		}
		System.out.println("SEGUNDA VALIDACIÓN:");
		if (s1.equals(s2)) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("Son distintas.");
		}
	}
}
