package hackerrank;

import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder reversedStr = new StringBuilder();
        /* Enter your code here. Print output to STDOUT. */
        char[] characterValues = A.toCharArray();

        for(int i = characterValues.length - 1; i >= 0; i-- ) {
            reversedStr.append(characterValues[i]);
        }

        if(A.equals(reversedStr.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
