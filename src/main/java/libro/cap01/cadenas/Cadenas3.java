package libro.cap01.cadenas;

public class Cadenas3 {
	public static void main(String[] args) {
		String s = "Esto es una cadena de caracteres";

		String s1 = s.substring(0,7);
		String s2 = s.substring(8,11);

		//Toma desde el caracter 8 hasta el final
		String s3 = s.substring(8);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
