package leetcodechallenges;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.IntStream;

public class _20_ValidParentheses {

    public static void main(String[] args) {
        String valueToTest = "([])";
        //String valueToTest = "(]";
        //String valueToTest = "()[]{}";

        boolean result = isValid(valueToTest);
        boolean result2 = isValidFunctional(valueToTest);

        System.out.printf("First validation result: %s\n",result);
        System.out.printf("Second validation result: %s\n",result2);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static boolean isValidFunctional(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        return IntStream.range(0, input.length())
                .mapToObj(input::charAt)
                .allMatch(c -> {
                    switch (c) {
                        case '(' -> stack.push(')');
                        case '{' -> stack.push('}');
                        case '[' -> stack.push(']');
                        default -> {
                            if (stack.isEmpty() || stack.pop() != c) {
                                return false;
                            }
                        }
                    }
                    return true;
                }) && stack.isEmpty();
    }
}
