package libro.cap01.cadenas;

public class Cadenas9 {
	public static void main(String[] args) {
		//Dos cadenas iguales
		String s1 = "Hola";
		String s2 = "Hola";

		System.out.println("s1 = ["+s1+"]");
		System.out.println("s2 = ["+s2+"]");

		if(s1 == s2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintas");
		}

		/**
		 * En este caso el operador == retorna true, es decir: compara "bien" y el programa
		 * indicará que ambas cadenas son idénticas ¿por qué? Porque Java asignala cadena
		 * literal "Hola" en una porción de memoria y ante la aparición de la misma cadena
		 * no vuelve a alocar memoria para almacenar la misma información, simplemente obtiene
		 * una nueva referencia a dicha porción de memoria.
		 *
		 * En consecuencia, los dos objetos s1 y s2 apuntan al mismo espacio de memoria, son
		 * punteros idénticos y por este motivo el operador == retorna true.
		 */
	}
}
