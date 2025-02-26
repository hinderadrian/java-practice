package practicecoding;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        numbers.stream()
                .filter(n -> n% 2 == 0)
                .map(n -> n * 2)
                .forEach(System.out::println);

        Runnable r = () -> {
            System.out.println("Runnable");
        };
        Thread t = new Thread(r);
        //t.start();
        //t.start();
    }
}
