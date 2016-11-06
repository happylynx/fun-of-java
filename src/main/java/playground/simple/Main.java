package playground.simple;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Collections.singletonList(new A()).toArray({});
    }

    private static class A {}
}
