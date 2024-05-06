package hackerrank;

import java.util.Scanner;

public class JavaStringIntroduction {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		/* Enter your code here. Print output to STDOUT. */
		int totalLength = A.length() + B.length();
		String isAGreaterThanB = A.compareTo(B) > 0 ? "Yes" : "No";

		String upperCaseA = A.substring(0, 1).toUpperCase().concat(A.substring(1));
		String upperCaseB = B.substring(0, 1).toUpperCase().concat(B.substring(1));

		System.out.println(totalLength);
		System.out.println(isAGreaterThanB);
		System.out.println(upperCaseA.concat(" ").concat(upperCaseB));
	}
}
