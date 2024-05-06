package libro.cap01;

import java.util.Scanner;

public class DemoMatriz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de filas: ");
		int rows = scanner.nextInt();

		System.out.print("Ingrese la cantidad de columnas: ");
		int columns = scanner.nextInt();

		//Creamos una matriz de n filas x m columnas
		int matrix [] [] = new int[rows][columns];

		int number;
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				//Generamos un número aleatorio entre 0 y 100
				number = (int) (Math.random() * 100);
				// Asignamos el número en la matriz
				matrix[row][column] = number;
			}
		}

		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				// Imprimimos las celdas de la matriz
				System.out.print(matrix[row][column] + "\t");
			}
			System.out.println();
		}

	}
}
