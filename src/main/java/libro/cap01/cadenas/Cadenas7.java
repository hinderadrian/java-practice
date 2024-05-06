package libro.cap01.cadenas;

import java.util.StringTokenizer;

public class Cadenas7 {
	public static void main(String[] args) {
		String string = "Juan|Marcos|Carlos|Matias";

		StringTokenizer stringTokenizer = new StringTokenizer(string, "|");

		String token;
		while (stringTokenizer.hasMoreTokens()) {
			token = stringTokenizer.nextToken();
			System.out.println(token);
		}
	}
}
