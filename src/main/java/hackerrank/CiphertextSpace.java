package hackerrank;

import java.util.*;

public class CiphertextSpace {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String values = sc.next();
        sc.close();

        values.chars().forEach(charValue -> {
            int number = Integer.parseInt("" + (char) charValue);
            number = number == 9 ? 0 : number + 1;

            System.out.print(number);
        });
    }
}
