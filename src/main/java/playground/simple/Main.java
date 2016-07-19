package playground.simple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final Matcher matcher = Pattern.compile("^(\\w{2})(_(\\w{2}))?$").matcher("en");
        matcher.find();
        IntStream.rangeClosed(1, 3)
                .forEach(index -> System.out.println(index + " " + matcher.group(index)));
    }
}
