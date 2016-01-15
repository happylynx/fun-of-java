package playground.simple;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(5, 12)
                .map(Main::inc)
                .forEach(System.out::println);
    }

    private static int inc(int i) {
        if (i > 10) {
            throw new RuntimeException("greater than 10");
        }
        return i + 1;
    }
}
