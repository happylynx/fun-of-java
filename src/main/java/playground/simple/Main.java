package playground.simple;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        final List<Integer> list = Stream.of(1, 2)
                .skip(10)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
