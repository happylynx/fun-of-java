package playground.simple;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final ArrayList<StackTraceElement> stackFrame = new ArrayList<>();
        for (int i : new int[] {1, 2}) {
            final StackTraceElement frame = Thread.currentThread().getStackTrace()[0];
            stackFrame.add(frame);
        }
        final boolean equals = stackFrame.get(0).equals(stackFrame.get(1));
        System.out.println(equals);
    }
}
