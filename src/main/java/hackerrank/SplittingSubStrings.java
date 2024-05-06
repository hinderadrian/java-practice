package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SplittingSubStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		scan.close();

		String valueToTest = "He is a very very good boy, isn't he?";

		/**String [] values = s.split("[^A-Za-z]+");

		System.out.println(values.length);

		for (String stringValue : values) {
			System.out.println(stringValue);
		}*/
		List<String> list = Arrays.asList(s.split("[^A-Za-z]"))
				                    .stream()
				                    .filter(i -> !i.trim().equals(""))
				                    .collect(java.util.stream.Collectors.toList());

		System.out.println(list.size());

		list.stream().forEach(System.out::println);
	}
}
